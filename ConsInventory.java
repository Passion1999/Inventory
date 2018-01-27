package Inventory;

public class ConsInventory implements InVentory{
	private Toy first;
	private InVentory rest;

	public ConsInventory(Toy first) {
		this.first = first;
		this.rest=rest;
}
	public ConsInventory(Toy first, InVentory rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString()+"\n"
	+ this.rest.toString();

				}

	@Override
	public boolean contains(String name) {
		return this.first.containToy(name)||this.rest.contains(name);
	}
// Kiem tra xem gia cua do choi co nho hon mot nguong nao do hay khong:
	@Override
	public boolean Isbelow(int threshold) {
		return this.first.checkBelow(threshold)|| 
							this.rest.Isbelow(threshold);
	}
// dem so luong do choi trong danh sach
	@Override
	public int howMany() {
		return 1+this.rest.howMany();
	}
// xuat ra danh sach sach do choi voi gia moi da tinh rate
	@Override
	public InVentory raiseRate(double rate) {
		return 
				new ConsInventory(new Toy(this.first.getName(), this.first.raiseRateToy(rate), this.first.available), 
						this.rest.raiseRate(rate));
		
	}
// Tinh gia trung binh cua do choi trong danh sach:
	@Override
	public double averagePrice() {
		return this.sumPrice()/this.sumAvailable();
	}
// Tinh tong gia cua do choi
	@Override
	public double sumPrice() {
		return this.first.getPrice()+this.rest.sumPrice();
	}
// Tinh tong do choi co san 
	@Override
	public double sumAvailable() {
		return this.first.getAvailable()+this.rest.sumAvailable();
	}
// thay the ten bang phuon thuc replace co san trong java:
	@Override
	public InVentory replaceName() {
		return new ConsInventory(this.first.replaceNameToy(), this.rest.replaceName());
	}
// Loai bo ten va xuat ra danh sach ten con lai:
	@Override
	public InVentory eliminale(String nameEliminate) {
		if(!(this.first.ToyOfName(nameEliminate)))
			return new ConsInventory(this.first, this.rest.eliminale(nameEliminate));
		return this.rest.eliminale(nameEliminate);
}

	}

	
	
	

	


