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