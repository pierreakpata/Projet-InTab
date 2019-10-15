import java.util.Arrays;

public class IntTab {
    private final int emptyElement;
    private static final int MAX_SIZE =  10000;
    int[] tab = new int[MAX_SIZE];
    int size;

    public IntTab(){
        this.emptyElement=0;
        this.size=0;
    }

    public IntTab(int size){
        this.size=size;
        this.emptyElement=0;
        for(int i=0; i<size; i++){
            tab[i]=emptyElement;
        }
    }

    public IntTab(int size, int e){
        this.size=size;
        this.emptyElement=e;
        for(int i=0; i<size; i++){
            tab[i]=emptyElement;
        }
    }

    public int getSize(){
        return this.size;
    }

    public int get(int i){
        if(i>=0 && i<size){
            return tab[i];
        }else{
            return this.emptyElement;
        }

    }

    public boolean set(int data, int i){
        if(i>=0 && i<size){
            tab[i]=data;
            return true;
        }else{
            return false;
        }
    }

    public boolean addLast(int e){
        int lastPosition=(this.size);
        if(lastPosition < MAX_SIZE){
            tab[lastPosition]=e;
            this.size++;
            return true;
        }else{
            return false;
        }
    }

    public boolean resize(int s){
        if(s > size && s <= MAX_SIZE){
            for(int i=size; i<s; i++){
                tab[i]=this.emptyElement;
            }
            this.size=s;
            return true;
        }else{
            return false;
        }
    }

    public boolean insert(int data, int i){
        if(size+1 <=MAX_SIZE && i>=0 && i<MAX_SIZE){
            int temp1=tab[i];
            int temp2=tab[i+1];
            tab[i]=data;
            for(int j=i+1; j<(size+1); j++){
                tab[j]=temp1;
                temp1=temp2;
                if(j+1 < MAX_SIZE){
                    temp2=tab[j+1];
                }
            }
            this.size++;
            return true;
        }else{
            return false;
        }
    }


    public boolean remove(int i){
        if(i>=0 && i<size){
            int temp;
            for(int j=i; j<(size-1); j++){
                temp=tab[i];
                tab[j]=tab[j+1];
                tab[j+1]=temp;
            }
            tab[size-1]=0;
            this.size--;
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        String ch="Tab=[";
        for(int i=0; i<size; i++){
            if(i<size-1){
                ch+=String.valueOf(tab[i]+",");
            }else{
                ch+=String.valueOf(tab[i]);
            }
        }
        ch+="]";
        return ch;
    }
}
