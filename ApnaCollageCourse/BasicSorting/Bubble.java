public class Bubble {

    public static void Swap(int Array[]){

        for(int turn=1;turn<Array.length;turn++){
            for(int j=0;j<Array.length-1-turn;j++){
                if(Array[j]>Array[j+1]){
                    //Swap
                    int temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
                }
            }
        }
        for(int i=0; i<Array.length;i++){
            System.out.println(Array[i]);
        }
    }

    public static void main(String[] args) {
        int Array[]= {1,4,2,5,7,5,8};
        Swap(Array);
    }
    
}
