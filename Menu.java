package proyectorestaurante;

public class Menu {


public Menu (){}

String name = "";
byte op1, op2;
double pago, iva = 0.15;

public Menu(String name, byte op1, byte op2, double pago, double iva){
	this.name = name;
        this.op1 = op1;
        this.op2 = op2;
        this.pago = pago;
        this.iva = iva;
  }

public void setname(String name){this.name = name;}
public String getname(){return name;}

public void setop1(byte op1){this.op1 = op1;}
public byte getop1(){return op1;}

public void setop2(byte op2){this.op2 = op2;}
public byte getop2(){return op2;}

public void setpg(double pago){this.pago = pago;}
public double getpg(){return pago;}

public void setiva(double iva){this.iva = iva;}
public double getiva(){return iva;}

public double CambDMon(){
 return pago*35.88;
  }

public void MenuDR(){
	 System.out.println("     |---------------------------------------------------------------------------------------------|");
	System.out.println("     |----------------------------       M A R G A R I T A´ S       --------------------------|");
	System.out.println("     |_____________________________________________________________________________________________|\n");
	System.out.println("     |   M E N U:                                                                                  |\n"+
	"     |           1- Entradas\n"+
	"     |                    1- Dedos de queso ------------------------------------------------ C$60  |\n"+
	"     |                    2- Guacamole ----------------------------------------------------- C$30  |\n"+
	"     |                    3- Papas a la francesa ------------------------------------------- C$50  |\n"+    
	"     |           2- Sopas\n"+
	"     |                    1- Verduras ------------------------------------------------------ C$30  |\n"+
	"     |                    2- Fideos ---------------------------------------------------------C$30  |\n"+ 
	"     |           3- Plato fuerte\n"+
	"     |                    1- Pechuga de pollo empanizada ---------------------------------- C$120  |\n"+
	"     |                    2- Hamburguesa de carne de res ----------------------------------- C$90  |\n"+
	"     |                    3- Ensalada ------------------------------------------------------ C$40  |\n"+
	"     |           4- Postres C$60\n"+
	"     |                    1- Helado (Vainilla/Chocolate/Fresa)-------------------------------C$60  |\n"+
	"     |                    2- Flan napolitano ----------------------------------------------- C$60  |\n"+
	"     |                    3- Fresas con crema ---------------------------------------------- C$60  |\n"+
	"     |                    4- Platanos fritos ----------------------------------------------- C$60  |\n"+
	"     |           5- Bebidas\n"+
	"     |                    1- Naranja ------------------------------------------------------- C$35  |\n"+
	"     |                    2- Malteada ------------------------------------------------------ C$35  |\n"+
	"     |                    3- Grama --------------------------------------------------------- C$35  |\n"+
	"     |                    4- Cacao --------------------------------------------------------- C$40  |\n"+
	"     |                    5- Cerveza ------------------------------------------------------- C$45  |\n"+
	"     |           6- Revisar pedido\n"+
	"     |                    1- Agregar algo mas                                                      |\n"+
	"     |           7- Terminar pedido\n"+
	"     |           8- Metodo de pago                                                                 |\n"+
	"     |                    1- Efectivo                                                              |\n"+
	"     |                    2- Tarjeta                                                               |\n");
	System.out.println("     |---------------------------------------------------------------------------------------------|");

	System.out.println("     |_____________________________________________________________________________________________|\n");


	  }

}


