public class Bus {
    private int busNo;
    private Boolean ac;
    private int capacity;
    Bus(int no, Boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getbusNo(){
        return busNo;
    }
    public void setbusNo(int no){
        this.busNo=no;
    }

    public Boolean getac(){
        return ac;
    }
    public void setac(Boolean ac){
        this.ac=ac;
    }

    public int getcapacity(){
        return capacity;
    }
    public void setcapacity(int cap){
        this.capacity=cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:"+busNo + " Ac:" +ac + " Capacity:"+capacity);
    }
}
