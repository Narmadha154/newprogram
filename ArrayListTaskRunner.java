
package arraylist;
import java.util.*;
public class ArrayListTaskRunner{
  public static String[] getString(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of Strings:");
     int size=sc.nextInt();
     String [] stringArray=new String[size];
      for(int i=0;i<size;i++){
            stringArray[i]=sc.next();
      }
    return stringArray;
   }
   
   public static int[] getInteger(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of Strings:");
     int size=sc.nextInt();
     int [] integerArray=new int[size];
      for(int i=0;i<size;i++){
            integerArray[i]=sc.nextInt();
      }
    return integerArray;
   }
   public static Double[] getDouble(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of double values:");
     int size=sc.nextInt();
     Double [] doubleArray=new Double[size];
      for(int i=0;i<size;i++){
            doubleArray[i]=sc.nextDouble();
      }
    return doubleArray;
   }
   
   public static Long[] getLong(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of long values:");
     int size=sc.nextInt();
     Long [] longArray=new Long[size];
      for(int i=0;i<size;i++){
            longArray[i]=sc.nextLong();
      }
    return longArray;
   }
  public static ArrayList<Student> createCustomList(){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
      ArrayList<Student> customList=new ArrayList<>();
      for(int i=0;i<size;i++){
         customList.add(new Student(rollNo[i],name[i],marks[i]));
      }
      return customList;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
    case 1:
       int length=ArrayListTask.findLength();
       System.out.println("Length of the ArrayList is:"+length);
       break;
   case 2:
       String [] strArray=getString();
       ArrayList<String> list=ArrayListTask.findStringLength(strArray);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
       }
       int arrayLength=list.size();
       System.out.println("Length of the ArrayList with elements:"+arrayLength);
       break;
  case 3:
       int [] intArray=getInteger();
       ArrayList<Integer> intList=ArrayListTask.findIntegerLength(intArray);
        System.out.println("ArrayList elements are:");
        for(int i=0;i<intList.size();i++){
          System.out.println(intList.get(i));
       }
       int intListLength=intList.size();
       System.out.println("Length of the Integer ArrayList:"+intListLength);
       break;
  case 4:
       ArrayList<Student> customArrayList=createCustomList();
       System.out.println("Custom ArrayList elements:");
       for(int i=0;i<customArrayList.size();i++){
           System.out.println(customArrayList.get(i)+" ");
      }
       int customListLength=customArrayList.size();
       System.out.println("Custom ArrayList size:"+customListLength);
       break;
  case 5:
         String [] strArr=getString();
         int [] intArr=getInteger();
         ArrayList<Student> customArrList=createCustomList();
       ArrayList<Object> objList=ArrayListTask.createList(intArr,strArr,customArrList);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<objList.size();i++){
         System.out.println(objList.get(i)+" ");
      }
       int objLength=objList.size();
       System.out.println("ArrayList size:"+objLength);
       break;
  case 6:
       String [] stArray=getString();
       System.out.println("Enter the string for which you want to find index:");
       String str=sc.next();
       ArrayList<String> strList=ArrayListTask.findIndex(stArray,str);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<strList.size();i++){
         System.out.println(strList.get(i));
       }
       break;
  case 7:
        String [] stArr=getString();
      ArrayList<String> stringArrList=ArrayListTask.iterateArrayList(stArr);
       Iterator<String> iter=stringArrList.iterator();
       System.out.println("ArrayList elements using iterator:");
       while(iter.hasNext()){
          System.out.println(iter.next()+" ");
       }
       System.out.println("ArrayList elements using for loop:");
       for(int i=0;i<stringArrList.size();i++){
         System.out.println(stringArrList.get(i)+" ");
       }
       break;
  case 8:
       String [] stringArr=getString();
       System.out.println("Enter the index:");
       int index=sc.nextInt();
       ArrayList<String> newList=ArrayListTask.findStringAtIndex(stringArr,index);
       int newLength=newList.size();
       System.out.println("Length of the string :"+newLength);
       break;
  case 9:
        String [] stringArr1=getString();
       int lastIndex=ArrayListTask.findIndexOfDuplicate(stringArr1);
       System.out.println("Last index of the duplicate element is:"+lastIndex);
       break;
  case 10:
        String [] stringArr2=getString();
       System.out.println("Enter the string to be entered:");
       String strSecond=sc.next();
       System.out.println("Enter the position where string to be entered:");
       int position=sc.nextInt();
       ArrayList<String> addedList=ArrayListTask.addString(stringArr2,strSecond,position);
       System.out.println("ArrayList elements after adding a string:");
       for(String arr:addedList){
         System.out.println(arr);
       }
      int addedListLength=addedList.size();
      System.out.println("Size of the ArrayList after adding a string:"+addedListLength);
       break;
  case 11:
       String [] stringArr3=getString();
       System.out.println("Enter the index where second arraylist starts:");
       int startIndex=sc.nextInt();
       System.out.println("Enter the index where second arraylist ends:");
       int endIndex=sc.nextInt();
       ArrayList<String> secondList=ArrayListTask.createArrayList(stringArr3,startIndex,endIndex);
       System.out.println("Second ArrayList elements:");
       for(String secondArray:secondList){
         System.out.println(secondArray);
       }
       int secondLength=secondList.size();
       System.out.println("Second ArrayList size:"+secondLength);
       break;
 case 12:
       String [] firstArray=getString();
       String [] secondArray=getString();
       ArrayList<String> thirdList=ArrayListTask.createThreeArrayList(firstArray,secondArray);
       System.out.println("Third ArrayList elements:");
      for(int i=0;i<thirdList.size();i++){
         System.out.println(thirdList.get(i)+" ");
      }
      int thirdArrLength=thirdList.size();
       System.out.println("third ArrayList size:"+thirdArrLength);
       break;
  case 13:
        String [] firstArr=getString();
       String [] secondArr=getString();
       ArrayList<String> thirdArrList=ArrayListTask.createThirdArrayList(firstArr,secondArr);
       System.out.println("Third ArrayList elements:");
       for(int i=0;i<thirdArrList.size();i++){
         System.out.println(thirdArrList.get(i)+" ");
      }
       int thirdLength=thirdArrList.size();
       System.out.println("third ArrayList size:"+thirdLength);
       break;
 case 14:
       Double [] doubleArray=getDouble();
       System.out.println("enter the value to be removed:");
       double decimalValue=sc.nextDouble();
       ArrayList<Double> decimalList=ArrayListTask.removeDecimalValue(doubleArray,decimalValue);
       int decimalListLength=decimalList.size();
       System.out.println("Arraylist after removing an element:");
       for(Double arr:decimalList){
         System.out.println(arr);
       }
       System.out.println("ArrayList size after removing an element:"+decimalListLength);
       break;
 case 15:
        Double [] doubleArr=getDouble();
       System.out.println("Enter the index where the value to be removed:");
       int removePosition=sc.nextInt();
       ArrayList<Double> deciList=ArrayListTask.removeDecimalValueAtIndex(doubleArr,removePosition);
       int deciLength=deciList.size();
       System.out.println("Arraylist after removing an element at given position:");
       for(Double deciArray:deciList){
         System.out.println(deciArray);
       }
       System.out.println("ArrayList size after removing an element:"+deciLength);
       break;
 case 16:
       Long [] longArray=getLong();
       System.out.println("Enter the start index:");
       int stIndex=sc.nextInt();
       System.out.println("Enter the end index:");
       int edIndex=sc.nextInt();
       ArrayList<Long> longArrayList=ArrayListTask.removeLongValue(longArray,stIndex,edIndex);
       int removedListLength=longArrayList.size();
        System.out.println("Arraylist after removing the elements:");
        for(Long arrayLong:longArrayList){
           System.out.println(arrayLong);
        }
        System.out.println("ArrayList size:"+removedListLength);
       break;
 case 17:
          String [] firstArr1=getString();
       String [] secondArr1=getString();
       ArrayList<String> firstList=ArrayListTask.removeElements(firstArr1,secondArr1);
       System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:");
       for(int i=0;i<firstList.size();i++){
         System.out.println(firstList.get(i)+" ");
       }
       int firstLength=firstList.size();
       System.out.println("First ArrayList size after removing elements which are present in 2nd arraylist:"+firstLength);
       break;
 case 18:
       String [] firstArr2=getString();
       String [] secondArr2=getString();
       ArrayList<String> firstArrList=ArrayListTask.removeNonDuplicateElements(firstArr2,secondArr2);
       System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:");
       for(int i=0;i<firstArrList.size();i++){
         System.out.println(firstArrList.get(i)+" ");
       }
       int firstListLength=firstArrList.size();
       System.out.println("ArrayList size after removing elements which are not present in 2nd arraylist:"+firstListLength);
       break;
  case 19:
        Long [] longArr=getLong();
       ArrayList<Long> longArrList=ArrayListTask.removeAllLongValue(longArr);
       int longListSize=longArrList.size();
       System.out.println("Arraylist after removing the elements:");
       for(Long longArray1:longArrList){
          System.out.println(longArray1);
       }
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       String [] stArray1=getString();
       System.out.println("Enter the string to be checked:");
       String checkStr=sc.next();
       ArrayList<String> checkList=ArrayListTask.checkString(stArray1,checkStr);
       int checkListLength=checkList.size();
       System.out.println("ArrayList elements are:");
       for(String checkArr:checkList){
          System.out.println(checkArr);
       }
       System.out.println("ArrayList size:"+checkListLength);
       break;
   default:
       System.out.println("No program");
       break;
   }
 }
}
 
