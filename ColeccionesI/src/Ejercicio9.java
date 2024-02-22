import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Robot {
	private final String nombre;
	private final int tiempoProceso;
	private LocalTime tiempoActual;

	public Robot(String nombre, int tiempoProceso) {
		this.nombre = nombre;
		this.tiempoProceso = tiempoProceso;
		this.tiempoActual = LocalTime.MIN;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTiempoProceso() {
		return tiempoProceso;
	}

	public LocalTime getTiempoActual() {
		return tiempoActual;
	}

	public void setTiempoActual(LocalTime tiempoActual) {
		this.tiempoActual = tiempoActual;
	}
}

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] robotsInfo = scanner.nextLine().split(";");
		List<Robot> robots = new ArrayList<>();
		for (String info : robotsInfo) {
			String[] partes = info.split("-");
			robots.add(new Robot(partes[0], Integer.parseInt(partes[1])));
		}
		String horaComienzoStr = scanner.nextLine();
		LocalTime horaComienzo = LocalTime.parse(horaComienzoStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
		Queue<String> productos = new LinkedList<>();
		while (true) {
			String producto = scanner.nextLine();
			if (producto.equals("fin")) {
				break;
			}
			productos.add(producto);
		}

		LocalTime tiempoActual = horaComienzo;
		while (!productos.isEmpty()) {
			String producto = productos.poll();
			Robot robotDisponible = obtenerRobotDisponible(robots, tiempoActual);
			if (robotDisponible != null) {
				robotDisponible.setTiempoActual(tiempoActual);
				System.out.println(robotDisponible.getNombre() + " - " + producto + " [" + tiempoActual + "]");
				tiempoActual = tiempoActual.plusSeconds(robotDisponible.getTiempoProceso());
			} else {
				productos.add(producto);
				tiempoActual = tiempoActual.plusSeconds(1);
			}
		}
	}

	public static Robot obtenerRobotDisponible(List<Robot> robots, LocalTime tiempoActual) {
		for (Robot robot : robots) {
			if (tiempoActual.isAfter(robot.getTiempoActual().plusSeconds(robot.getTiempoProceso()))) {
				return robot;
			}
		}
		return null;
	}
}
