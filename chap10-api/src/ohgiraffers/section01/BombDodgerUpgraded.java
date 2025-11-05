package ohgiraffers.section01;

// BombDodgerUpgraded.java

import java.io.*;
import java.util.*;

public class BombDodgerUpgraded {
    // --- 상수 ---
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    private static final char PLAYER = '@';
    private static final char BOMB = '*';
    private static final char EMPTY = '.';

    // 게임 루프 속도 제어 (30 FPS)
    private static final int TARGET_FPS = 30;
    private static final long TARGET_TIME_PER_FRAME = 1000 / TARGET_FPS;

    // --- 게임 상태 변수 ---
    private int playerX;
    private final List<Bomb> bombs = new ArrayList<>();
    private final Random random = new Random();
    private boolean gameOver;
    private long score;
    private long dropInterval;
    private long startTime; // 게임 시작 시간 (점수 계산용)

    // 화면 출력을 위한 StringBuilder (깜빡임 제거용)
    private final StringBuilder screenBuilder = new StringBuilder();

    private static class Bomb {
        int x, y;
        Bomb(int x, int y) { this.x = x; this.y = y; }
    }

    public static void main(String[] args) {
        new BombDodgerUpgraded().runGame();
    }

    /**
     * 게임의 전체 생명주기를 관리합니다 (시작 -> 재시작 -> 종료)
     */
    private void runGame() {
        System.out.println("폭탄 피하기 게임 시작!");
        System.out.println("a : 왼쪽   d : 오른쪽   q : 종료");

        boolean keepPlaying = true;
        while (keepPlaying) {
            startGameLoop(); // 실제 게임 플레이
            gameOver();      // 게임 오버 처리
            keepPlaying = askForRestart(); // 재시작 여부 확인
        }
        System.out.println("게임을 종료합니다. 이용해주셔서 감사합니다!");
    }

    /**
     * 모든 게임 상태를 초기화합니다.
     */
    private void resetGame() {
        playerX = WIDTH / 2;
        bombs.clear();
        gameOver = false;
        score = 0;
        dropInterval = 800; // 초기 폭탄 낙하 간격
        startTime = System.currentTimeMillis(); // 게임 시작 시간 기록
    }

    /**
     * 메인 게임 루프를 실행합니다.
     */
    private void startGameLoop() {
        resetGame();
        countdown();

        long lastDrop = System.currentTimeMillis();

        while (!gameOver) {
            long loopStartTime = System.currentTimeMillis(); // 루프 시작 시간

            // 1. 점수 및 상태 업데이트
            long now = loopStartTime;
            score = (now - startTime) / 1000; // 경과 시간(초)

            // 2. 폭탄 생성 (난이도 조절 포함)
            if (now - lastDrop >= dropInterval) {
                dropBomb();
                lastDrop = now;
                // 점수에 따라 난이도 상승 (최소 200ms 간격)
                dropInterval = Math.max(200, 800 - (score / 10) * 30);
            }

            // 3. 폭탄 아래로 이동
            moveBombsDown();

            // 4. 충돌 체크
            if (checkCollision()) {
                gameOver = true; // 충돌 시 루프 종료
                continue; // 즉시 루프를 빠져나감
            }

            // 5. 입력 처리
            handleKey();

            // 6. 화면 그리기 (깜빡임 없는 방식)
            drawScreen();

            // 7. FPS 제어 (가변 슬립)
            long loopElapsedTime = System.currentTimeMillis() - loopStartTime;
            long sleepTime = TARGET_TIME_PER_FRAME - loopElapsedTime;

            if (sleepTime > 0) {
                sleep(sleepTime);
            }
            // (sleepTime이 0보다 작으면, 프레임이 밀렸다는 의미이므로 다음 프레임으로 바로 넘어감)
        }
    }

    private void countdown() {
        for (int i = 3; i > 0; i--) {
            clearScreen(); // 카운트다운 중에는 화면을 지웁니다.
            System.out.println("\n\n\n");
            System.out.println(" ".repeat(WIDTH) + i + "...");
            System.out.println("\n\n\n");
            sleep(800);
        }
    }

    // ── 입력 ─────────────────────────────────────
    private void handleKey() {
        try {
            if (System.in.available() > 0) {
                int ch = System.in.read();
                switch (Character.toLowerCase((char) ch)) {
                    case 'a' -> { if (playerX > 0) playerX--; }
                    case 'd' -> { if (playerX < WIDTH - 1) playerX++; }
                    case 'q' -> gameOver = true;
                }
                // 버퍼 비우기
                while (System.in.available() > 0) System.in.read();
            }
        } catch (IOException ignored) {}
    }

    // ── 게임 로직 ─────────────────────────────────
    private void dropBomb() {
        bombs.add(new Bomb(random.nextInt(WIDTH), 0));
    }

    private void moveBombsDown() {
        // Iterator를 사용하여 안전하게 리스트 항목 제거
        Iterator<Bomb> iterator = bombs.iterator();
        while (iterator.hasNext()) {
            Bomb b = iterator.next();
            b.y++;
            if (b.y >= HEIGHT) {
                iterator.remove(); // 화면 밖으로 나간 폭탄 제거
            }
        }
    }

    private boolean checkCollision() {
        // 플레이어 위치(HEIGHT - 1)와 같은 y좌표를 가진 폭탄 중
        // x좌표가 일치하는 것이 있는지 확인
        for (Bomb b : bombs) {
            if (b.y == HEIGHT - 1 && b.x == playerX) {
                return true;
            }
        }
        return false;
    }

    private void gameOver() {
        clearScreen(); // 게임 오버 시 화면을 한 번만 지웁니다.
        drawScreen();  // 마지막 게임 상태를 보여줍니다.
        System.out.println("\n💥 폭탄에 맞았습니다! GAME OVER 💥");
        System.out.println("최종 생존 시간 : " + score + "초");
    }

    private boolean askForRestart() {
        System.out.println("\n다시 플레이하시겠습니까?");
        System.out.println("(r: 다시 시작, q: 종료)");
        try {
            // 입력 버퍼 비우기
            while (System.in.available() > 0) System.in.read();

            while (true) {
                int ch = System.in.read(); // 사용자의 입력을 기다림 (Blocking)
                if (ch == 'r' || ch == 'R') return true;
                if (ch == 'q' || ch == 'Q') return false;
            }
        } catch (IOException e) {
            return false; // 오류 발생 시 종료
        }
    }

    // ── 화면 출력 (UX 개선) ────────────────────────

    /**
     * 깜빡임을 없앤 화면 그리기 메서드
     */
    private void drawScreen() {
        // 1. StringBuilder 초기화
        screenBuilder.setLength(0);

        // 2. 커서를 홈으로 이동 (화면을 지우는 대신 덮어씀)
        screenBuilder.append("\033[H");

        // 3. 화면 내용 그리기 (StringBuilder에만 추가)
        screenBuilder.append("점수: ").append(score).append("초   (폭탄 간격: ").append(dropInterval).append("ms)\n");
        screenBuilder.append("┌").append("─".repeat(WIDTH * 3 - 1)).append("┐\n");

        for (int y = 0; y < HEIGHT; y++) {
            screenBuilder.append("│");
            for (int x = 0; x < WIDTH; x++) {
                if (y == HEIGHT - 1 && x == playerX) {
                    screenBuilder.append(" ").append(PLAYER).append(" ");
                } else {
                    char cell = EMPTY;
                    // 폭탄이 있는지 확인 (더 효율적인 방법이 있지만, 폭탄이 적을 땐 괜찮음)
                    for (Bomb b : bombs) {
                        if (b.x == x && b.y == y) {
                            cell = BOMB;
                            break;
                        }
                    }
                    screenBuilder.append(" ").append(cell).append(" ");
                }
            }
            screenBuilder.append("│\n");
        }
        screenBuilder.append("└").append("─".repeat(WIDTH * 3 - 1)).append("┘\n");
        screenBuilder.append("  a ← → d   (q: 종료)\n");

        // 4. 완성된 화면을 한 번에 출력
        System.out.print(screenBuilder.toString());
        System.out.flush(); // 터미널 버퍼 강제 출력
    }

    /**
     * 화면을 완전히 지웁니다. (게임 루프 중에는 사용하지 않음)
     */
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // ── 유틸 ─────────────────────────────────────
    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}