import java.util.*;

public class Binary {

  public static int[] addBin(int[]a, int[]b){
    if (a.length!=8||b.length!=8){
      throw new
      illegalArgumentException("input must be octets");
    }
    for (int i=0; i<8; i++){
      if (a[i]<0||a[i]>1||b[i]<0||b[i]>1){
        throw new
        illegalArgumentException("input must be binary");
      }
    }
  }
  //find the sum
  public int[] addition(int[] a, int[] b){
    boolean overflow=false;
    for(int i=7; i>=0; i--){
      if(a[i]==b[i]){
        result[i]=0;
        if(overflow){
          result[i]=1;
          overflow=false;
        }
        if(a[i]==1){
          overflow=true;
        }
      }
      else{
        result[i]=1;
        if(overflow){
          result[i]=0;
          overflow=true;
        }
      }
    }
    return result;
  }

  //find difference
  public int[] substraction(int[] a, int[] b){
    int[] negBin2= new int[8];
    int[] complement= new int[] {0,0,0,0,0,0,0,1};

    for(int i=0; i<8; i++){
      if(b[i]==0){
        negBin2[i]=1;
      }
      else{
        negBin2[i]=0;
      }
    }
    negBin2=Arrays.copyOf(addition(negBin2,complement),8);
    return addition(a, negBin2);
  }

  //find quotient
  public int[] division(){
    remainder=Arrays.copyOf(bin1,8);
    int count=0;
    while(true){
      int[] newresult=Arrays.copyOf(remainder,8);
      remainder=Arrays.copyOf(substraction(newresult, bin2),8);
      if(remainder[0]!=1){
        count++;
      }
      else if(remainder[0]==1){
        remainder=Arrays.copyOf(newresult,8);
        break;
      }
    }
    for(int i=0; i<8; i++){
      int binary= count/(int)Math.pow(2,7-i);
      count=count%(int)Math.pow(2,7-i);
      result[i]=binary;
    }
    return result;
  }
  public int[] getRemainder(){
    return remainder;
  }


  //find product
  public int[] multiply(){
    result= new int[]{0,0,0,0,0,0,0,0};
    int mut=0;
    int[] newresult= new int[8];
    for(int i=7; i>=0 ; i--){
      mut+=bin2[i]*(int)Math.pow(2,7-i);
    }
    for(int i=1; i<=mut; i++){
      newresult=Arrays.copyOf(result,8);
      result=Arrays.copyOf(addition(newresult, bin1),8);
    }
    return result;
  }

  //detect overflow
    int sum = result[0]+a[0]+b[0];
    result[0]=sum&1;
    if(sum>>>1>0){
      throw new
      illegalArgumentException("overflow");
  }
  return result;
}
}

public class Binary {
  public static void main(String[] args){
    System.out.println("Gimme your first 8-bits binary number :");
    Scanner input1= new Scanner(System.in);
    String num1= input1.nextLine();

    System.out.println("Gimme your second one :");
    Scanner input2= new Scanner(System.in);
    String num2= input2.nextLine();

    System.out.println("You wanna add, substract, multiply or divide?");
    Scanner input3= new Scanner(System.in);
    char operator= input3.next().charAt(0);

}
}
