class Shelf{

    int length;
 
    int breadth;
 
    int capacity;
 
    boolean occupied;
 
    Shelf(int length,int breadth, int capacity){
        this.length = length;
        this.breadth = breadth;
        this.capacity = capacity;
        this.occupied = false;
 
    }
 
 
    public void setLength(int length){
 
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
 
    }
 
    public void setCapacity(int capacity){
 
        this.capacity = capacity;
 
    }
 
    public void setOccupied(boolean occupied){
 
        this.occupied = occupied;
 
    }
 
       public int getLength(){
 
        return this.length;
    }
    public int getBreadth(){
        return this.breadth;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public boolean getOccupied(){
        return this.occupied;
    }
 
  public String toString(){
 
  return "Shelf: \n"+" length: "+Integer.toString(this.length)+" breadth: "+Integer.toString(this.breadth)+" capacity: "+Integer.toString(this.capacity)+" occupied: "+Boolean.toString(this.occupied);
 
 }  
 }
 public class third {
  public static void main(String[] args) {
 
    Shelf s1=new Shelf(100,150,300);
 
    Shelf s2=new Shelf(200,200,234);  
 
    Shelf s3=new Shelf(300,222,543);  
 
    Shelf s4=new Shelf(400,434,654);
 
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    s4.setLength(5);
    System.out.println(s4);
    s2.setBreadth(2);
    System.out.println(s2);
    s3.setCapacity(1);
    System.out.println(s3);
 
    s1.setOccupied(true);
 
    System.out.println(s1);
 
  }
 
 }