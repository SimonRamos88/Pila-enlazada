
package pilas.enlazadas;


public class PilasEnlazadas {
    private Node top;    
    
    public boolean empty(){
        return top.getNext() == null;
    }
    
    public boolean full(){ //Nunca se llena, a menos que nos quedemos sin memoria
        return false;
    }
    
    public void push(int value){
       Node aux = new Node(value);
       aux.setNext(this.top);
       this.top = aux;
       //Destruir aux? No es necesario, es inocuo y solo come como 8 bytes
    }
    
    public int pop(){
        /*int value = 0; //Aunque aqu{i lo mejor es tirar una excepci{on
        if(!empty()){
            value = this.top.getData();
            top = this.top.getNext(); //Guardamos la direccion del siguiente nodo
        }
        return value;*/
        /*
        if(empty()){
            throw new IllegalArgumentException("Esta vacio pa");
        }else{
            int value = this.top.getData();
            top = this.top.getNext(); //Guardamos la direccion del siguiente nodo
            return value;
        }*/
        if(!empty()){
            int value = this.top.getData();
            top = this.top.getNext(); //Guardamos la direccion del siguiente nodo
            return value;
        }else{
            throw new IllegalArgumentException("Esta vacio pa");
        }
        
    }
    
      public int toString(Node node){
        if(node.getNext()== null){
            return 0;
        }
        else{
            System.out.println(node.getData());
            return toString(node.getNext());
        }
    }
    
    public PilasEnlazadas(){
        this.top = new Node();
    }
    
    public PilasEnlazadas(int value){
        Node node = new Node(value);
        this.top = node;
    }
    
    
    public static void main(String[] args) {
        PilasEnlazadas pila = new PilasEnlazadas();
        pila.push(5);
        pila.push(3);
        pila.push(2);
        pila.toString(pila.top);
        System.out.println("-------");
        System.out.println(pila.top.getNext()==null);
        System.out.println("-------");
        pila.pop();
        pila.toString(pila.top);
        System.out.println("-------");
        pila.pop();
        pila.toString(pila.top);
        System.out.println("-------");
        pila.pop();
        pila.toString(pila.top);
        System.out.println("-------");
        pila.pop();
        pila.toString(pila.top);
    }
    
}
