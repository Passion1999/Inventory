package Inventory;

public class MTinventory implements InVentory {
	public String toString() {
		return " ";
	}

	@Override
	public boolean contains(String name) {
		return false;
	}

	@Override
	public boolean Isbelow(int threshold) {
		return false;
	}

	@Override
	public int howMany() {
		return 0;
	}

	@Override
	public InVentory raiseRate(double rate) {
		return new MTinventory();
	}

	@Override
	public double averagePrice() {
		return 0;
	}

	@Override
	public double sumPrice() {
		return 0;
	}

	@Override
	public double sumAvailable() {
		return 0;
	}

	@Override
	public InVentory replaceName() {
		return new MTinventory();
	}

	@Override
	public InVentory eliminale(String nameEliminate) {
		return new MTinventory();
	}
}
