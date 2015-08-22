package types;

public interface Entity {
	public void render();
	public void update();
	public void cull();
	public boolean checkIfCull();
}
