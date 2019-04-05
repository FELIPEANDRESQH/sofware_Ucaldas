package modelo;

import java.util.List;
/**
* Un equipo deportivo, que tiene varios jugadores y un entrenador
* @author Felipe Quintero
* @version 1.0
*
*/
public abstract class Equipo {
	private Jugador entrenador;
	protected List<Jugador> jugadores; 
	
	/**
	* Adiciona un nuevo jugador al equipo
	* @param jugador el nuevo jugador que se adicionará
	* @return boolean indicando si se pudo adicionar o no
	*/
	public boolean adicionarJugador(Jugador jugador) {
		return jugadores.add(jugador);
	}
} 