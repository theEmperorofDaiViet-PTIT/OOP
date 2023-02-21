package J05076;
import java.util.*;
public class Bill {
	private Merchandise M;
	private String merID;
	private long buyPrice;
	private long buyAmount;
	private long totalBuy;
	private long sellPrice;
	private long sellAmount;
	private long totalSell;
	
	Bill(String ID, long buyAmount, long buyPrice, long sellAmount){
		this.merID = ID;
		this.buyPrice = buyPrice;
		this.buyAmount = buyAmount;
		this.calTotalBuy();
		this.sellAmount = sellAmount;
	}
	
	public void setMerchandise(ArrayList<Merchandise> Mer) {
		for(Merchandise mem: Mer) {
			if(mem.getID().compareTo(this.merID) == 0) {
				this.M = mem;
				break;
			}
		}
	}
	
	public void calTotalBuy() {
		this.totalBuy = this.buyPrice * this.buyAmount;
	}
	
	public void calSellPrice() {
		if(this.M.getTier().compareTo("A") == 0) {
			this.sellPrice = this.buyPrice * (int)108 / 100;
		}
		else if(this.M.getTier().compareTo("B") == 0) {
			this.sellPrice = this.buyPrice * (int)105 / 100;
		}
		else if(this.M.getTier().compareTo("C") == 0) {
			this.sellPrice = this.buyPrice * (int)102 / 100;
		}
	}
	
	public void calTotalSell() {
		this.totalSell = this.sellPrice * this.sellAmount;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d %d\n", this.merID, this.M.getName(), this.totalBuy, this.totalSell);
	}
}
