package darkglory.combatentes;

public class Deuses extends Classe{
	protected String equipamentos;
	private boolean efeito = false;
	private int contador = 1;


	public Deuses(int id, String nome, int dano, int vida, int defesa, String tipo, String equipamentos) {
		super(id, nome, vida, dano, defesa, tipo);
		this.equipamentos = equipamentos;
	}

	public String getEquipameto() {
		return equipamentos;
	}

	public void setEquipamento(String equipamentos) {
		this.equipamentos = equipamentos;
	}
	
}
