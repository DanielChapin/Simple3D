import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

class Main {

	JFrame frame = new JFrame("Simple 3D");
	Canvas canvas = new Canvas();

	Game game;
	boolean running = true;

	public static void main(final String[] args) {
		new Main();
	}

	Main() {
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(canvas);
		frame.setVisible(true);

		canvas.createBufferStrategy(2);

		game = new Game(frame, canvas);

		long now = System.nanoTime(), lastLoop = now;
		final long loopTime = 1000000000 / 60;
		while (running) {
			now = System.nanoTime();
			if (now >= lastLoop + loopTime) {
				final float deltaTime = (float) (now - lastLoop) / loopTime;
				lastLoop = now;
				update(deltaTime);
				render(deltaTime);
			}
		}
	}

	void update(final float deltaTime) {
		game.update(deltaTime);
	}

	void render(final float deltaTime) {
		// Get the required rendering classes
		BufferStrategy bs = canvas.getBufferStrategy();
		Graphics g = bs.getDrawGraphics();
		
		// Clear the screen
		g.setColor(frame.getBackground());
		g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

		// Render
		game.render(deltaTime, g);

		// Clean up and swap buffers
		g.dispose();
		bs.show();
	}

}
