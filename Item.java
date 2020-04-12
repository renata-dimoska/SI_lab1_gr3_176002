class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
          A=18%;

	//TODO constructor
        Item(int id, String name, double price){
         this.id = id;
         this.name = name;
         this.price = price;
        }

	//TODO setters and getters
        public void setId(int id){
          this.id = id;
         }
        public void setName(String name){
          this.name = name;
         }
        public void setPrice(double price){
          this.price = price;
         }

        public int getId(){
         return id;
        }
        public String getName(){
         return name;
        }
        public double getPrice(){
         return price;
        }

	double taxReturn () {
		//TODO
           return price*A*15%;
	}
}

class Receipt{
String name;
Item *list;
int num;
Recepti(){
list = new Item[0];
}
Picerija(String name, Item *l, int numI){
this.name = name;
list = new Item[num];
for(int i=0;i<num;i++)
            list[i]=l[i];
        num=numI;
    }

 void dodadi(Item l) 
    {
        for(int i=0;i<num;i++)
                if(strcmp(l.getName(),list[i].getName())==0)
                return;
        Item *tmp;
        tmp=new Item[num];
        for(int i=0;i<num;i++)
            tmp[i]=list[i];
        delete[] list;
        list=new Item[num+1];
        for(int i=0;i<num;i++)
            list[i]=tmp[i];
        list[num]=l;
        num++;
        delete [] tmp;
    }
    
   int vkupno(){
   return cena.Item;
   }
}