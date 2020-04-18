package testing;

import java.util.Map;
import java.util.stream.Collectors;

public class NewJavaCode {

	public static void main(String[] args) {
		// 1.//How to find any letter like all 'e' from United State of America or from
		// any String ?

		String country = new String("United State Of America");
		int count = 0;
		for (int i = 0; i < country.length(); i++) {

			if (country.charAt(i) == 'e') {
				System.out.println("");
				System.out.println(country.charAt(i) + "::" + count);
				System.out.println("Index of e::" + i);
				count++;
			}
		}

		Map<String, Long> a = country.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		System.out.println(a);

//2.// How to reverse United State of America or reverse any string ?
//Reverse method:

		String country1 = new String("United State of America");

		// Or String country = "United State Of America";

		String obj = new StringBuffer(country1).reverse().toString();
		System.out.println(obj);

//Basic loop:
		for (int i = country1.length() - 1; i >= 0; i--) {
			System.out.println(country1.charAt(i));
		}
		// Find out which number contains 3 from 10 to 30 ?

		for (int i = 10; i <= 30; i++) {

			if (String.valueOf(i).contains("3")) {

				System.out.println(i);
			}
		}

//		            
////3.  How to split United State of America into 4 peace how loop an Array in java?

		String country3 = ("United State of America");
		String[] s = country3.split("");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

////4. Find out which number contains 3 from 10 to 30?   
		for (int i = 10; i <= 30; i++) {
			if (String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}

//// 5. //What is output of below program ?

		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);

		// It's a simple yet tricky program, it will print "Pankaj" because
		// we are assigning s2 string to s1.Dont't get confused with == comparison
		// operator.

////6. What si output of below program ?

		String s3 = new String("pankaj");
		String s4 = new String("PANKAJ");
		s4.intern();
		System.out.println(s3 == s4);

//	//It's tricky question and output will be false.We know that intern() method will
//	//Return the String object reference from the string pool,bu since we did not assigned
//	//it back to s2, there is no change in s2 and hence both s1 and s2 are haveing different
//	//Reference.if we change  the code in line 3 to s2 =s2.intern(); then output will be true.
//	
//	//7. How to check prime number or composite (non-prime) in java code?
//		
////	A prime number is the number that is only division by 1 or itself.For example, 11 is only divisible by 1 or itself.Other Prime numbers 2,3,5,7,11,13,17...
//	
//	//  Normal loop:
//		  
//		            //int max = 100;
//		     
//		           // loop through the numbers one by one- 1st loop
//		            for (int i = 1;i<100;++) {
//		            	
//		            //check to see if the number is prime - 2nd loop
//		            	for (int j = 2;j <100;i++) {
//		            		if (i % j == 0) {
//		            			//not prime
//		            			System.out.println(i +"Not prime");
//		            			System.out.println("-----");
//		            		break; // exit the 2nd for loop
//		            		}else {
//		            			System.out.println(i +"prime");
//		            			System.out.println("==============");
//		            			break;// exit the 2nd for loop
//		            		}
//		            	}
//		            }
//	
//	// Or
//	
//	//Find out 39 is a prime number or not 
//	//Code below for one single number :
//    int num = 39;
//	        
//	            for (int i=2;i++) {
//	            	
//	            if (num % i==0) { System.out.println("Not prime number::"+num);
//	            System.out.println("-----------"); break;}else {
//	            System.out.println("-----------");System.out.println("prime::"+num);}
//	            }
//	            
//// With Scanner class: find any number is prime or not
//	            
// int num, count=0;
// Scanner scan = new Scanner(System.in);
//	            
//System.out.println("Enter a Number :");
//num = scan.nextInt();
//	            
//for(int i=2; i<num;i++)
//	            {
//	            	if(num%i ==0)
//	            	{
//	            	   count++;
//	            	   break;
//	            	}
//	            }
//	            if(count == 0)
//	            {
//	          	System.out.println("This is Prime Number");
//	            }
//	            else
//	            {
//	            	System.out.println("This is not a Prime Number");
//	            }
//	            scan.close();
//		           }
//		           
////   8. How to swap value of two variable in java?
//				   
//				//   a. whitout using third variable.
//         //  Sample Solution:-
//        //   Java Code:
//public class Exercise 15 
//public static void main(String[]args) {
// //int, double,float
//				   int a,b; a = 15;
//				   b =27;
//				   System.out.println("Before swapping :a,b ="+a+","+ +b);
//				   a=a+b;
//				   b=a-b;
//				   a=a-b;
//				   System.out.println("After swapping :a,b ="+a+,"++b");
//				   
//				   
// // b. The simplest method to swap two variables is to use athird temporary variable :
// //define swap(a,b)
//  temp :=a
//  a:=b
// b:= temp
//				    
// // Sample Solution:
////   Java Code:
//	 public class Exerice 15	{
//	 public static void main(Sring[]args) {
//	 int a,b, temp;a = 15; b=27;
//	 System.out.println("Before swapping : a,b="+a+","++b);
//	 temp = a; a = b;b= temp;
//	 System.out.println("After swapping :a,b ="+a+","+ + b);}}
//	 temp = a,a = b;b = temp;
//	 Sample Solution(input from the user):Java Code:
//	imput java.util.Scanner,
//	public class Main{
//	public static void main(String[]args) {
//						 int x,y,z;
//						 Scanner in =new Scanner(System.in);
//						 System.out.println("input the first number");
//						 x=in.nextInt();
//						 System.out.println("input the second number:");
//						 y=in.nextInt();
//						 z=x;
//						 y=z;
//						 System.out.println("Swapped values are3:" +x+"and"+y);}}
//					
//					
////9. How to code for 4! in java?
//					
// //   Here, 4! is pronounced as "4 factorial", it is also called"4 bang"or"4 shirek"
// 4!=4*3*2*1=24
// public static void main(String args[]) {
// int fact=1;
//int number=4;//It is the number to calculate factorial
// for(int i=1;<=number,i++>){
//fact=fact*i, }
//System.out.println("Factorial of "+number+"is:"+fact);}
//				
////10. How to max number or min number from a list?
//ArreyList<integer> list=new Array List<>(3);
//list.add(10);list.add(20);list.add(30);list.add(40);
//					     
//					    // OLD JAVA CODE
//					       int max = list.get(0);//take first as MaxVal
//					          int secondmax=list.get(0);//take first as MaxVal
//					      //int max=integer,MIN_VALUE;
//					    for(int i=0;i<list.size();i++) {
//					    if(list.get(i)>max = list.get(i); if list.get(i)<max) {
//					    	secondmax=list.get(i);}} system.out.println(max);
//					    	    System.out.println(second max);
//					    	    // int min=integer.MAX_VALUE;
//					    	    int min= list.get(0);//take first as minVal
//					    	    int secondmin=list.get(0);//take first asminVal
//					    	    for(int i=0;i<list.size();i++) {
//					    	    	if(list.get(i)<min) {
//					    	    min=list.get(i);
//					    	    	} if(list.get(i)<min) {
//					    	    	secondmin =list.get(i);}} System.out.println(min);
//					    	    	System.out.println(secondmin);
//					    	    	
//					    	    	//JAVA STREAM API:
//					    	    	
//					    	    	System.out.println("=================Stream API====");
//					    	    	          int maxvalue=list1.stream()
//					    	    	        		  .max(Comparator.comparing(integer::valueOf))
//					    	    	        		  .get();
//					    	    	            System.out.pritln("JAVA 8::"+maxvalue);
//					    	    	            
//					    	    	            list1.remove(maxValue);
//					    	    	            
//					    	    	             int secondMaxValue = list1.stream()
//					    	    	          
//					    	    	           .max(Comparator.comparing(integer::valueOf))
//					    	    	                 .get();
//					    	    	               System.out.println("2nd max::+ secondMaxValue");
//					    	    	               
//					    	    	               int minValue =list1.stream()
//					    	    	        
//.min(Comparator.comparing(integer::valueOf))
// .get();
//					    	    	                      
// System.out.println("JAVA 8::"+minValue);
// 
// //11.Hoe to to find min and maxnfrom an arrey in java?
// 
//     int arr[] = {66,85,33,99,14,46,47,86,92,52,48,36,};
//     
//     
//     //OLD JAVA
//               int largest=arr[0];
//               int secondLargest=arr[0];
//               int minValue=arr[0];
//               int secondminValue=arr[0];
//               
//               
//               System.out.println("The given array is");
//               
//               for(int i=0;<arr.lenght;i++) {
//            	   
//               }
//            	   System.out.print(arr[i]+"\t");
//               }
//               for (int i=0;i<arr.length;i++) {
//            	   
//            	   if (arr[i]>largest) {
//            		   secondLargest=largest;
//            		   largest=arr[i];
//            		   
//            	   }else if(arr{[i]>secondLargest) {
//            		   secondminValue=minValue;
//            		   minValue=arr[i];
//            	   }
//            	   if(arr[i]<minValue) {
//            		   secoundminValue=minValue;
//            		   minValue=arr[i];
//            		   
//            	   }else if(arr{[i]>secondLargest) {
//  secondminValue=arr[i];
//  System.out.println("====Old Java====");}}
//            	   System.out.println("Largest number is:"+largest);
//            	   System.out.println("Second largest number is:"+largest);
//            	              System.out.println("Second min number is:"+secondminValue);
//            	              
//            	              AVA 8::Stream API
//            	              
//            	              System.out.println("=========JAVA8::Stream API========");
//            	                    int array[]= {14,46,47,86,92,52,48,36,66,85 };
//            	                    
//            	                    int max=Arrays.stream(array).max().getAslnt();
//            	                    
//            	                    System.out.println("JAVA 8::"+max);
//            	                    
//            	                    int secondMax=Arrray.stream(array)
//            	                    		.filter(i->i<max).max().getAslnt();
//            	                    
//            	                    System.out.println("JAVA 8::"+secondMax);
//            	                    
//            	                    int min=Arrays.stream(array).min().getAsInt();
//            	                    
//            	                    System.out.println("JAVA 8::"+min);
//            	                    
//            	                    int secondMin=Arrays.seream(array)
//            	                    		.filter(i->min).min().getAslnt();
//            	                    
//            	                    System.out.println("JAVA 8::"+secondMin);
//            	                    
//            	             //12. How to add item in list/ArrayList/set/Hashset/LinkHaset/Treeset
//            	                    c. Add()
//            	                    
//            	             //13. How to add iteams inside map?
//            	                    d.put()
//            	                    
//            	             //14.How to get value from a list/ArrayList/LinkList/setHashset/Treeset
//            	                    
//            	                    e.Looop>>>get()
//					    	    		
//	15// How to remove duplicate value from a list ?
//					    	    		
//		org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List<String>listAll=Arrays.asList("sarower","sarower","sarower,",
//				+ ""ahammed","ahammed');
//				
//		System.out.println("===========OldJAVA=========");
//		              Set<String> s=new HashSet<String>(listAll);
//		              
//		              System.out.println(s);
//		          
//		      System.out.println("==========JAVA 8 streamAPI================");
//		        
//		                  //Create alist with the distinct elements using stream.
//		                   List<String>listDistinct=
//		                		
//		      listAll.stream().distinct().collect(Collectors.toList());
//		                   
//		                         System.out.println(listDistinct);
//		                         
//		                      list,<integer>list=new ArrayList<>();
//		                                    list.add(10);
//		                                    list.add(20);
//		                                    list.add(10);
//		                                    list.add(10);
//		                                    list.add(20);
//		                      System.out.println("============Old"
//		                      JAVA==============================");
//		                      		          Set<integer>s1=new HashSet<integer>(list);
//		                      		          
//		                      		          System.out.println(s1);
//		                      System.out.println("=============JAVA 8 stream"
//		                      API==============================");"
//		                      		List<integer> noDistinct=
//		                     list.stream().distinct().collect(Collectors.toList());
//		                      		
//		                      		System.out.println(noDistinct);
//		                     	
//		                      				          
//		            
//		
//            	                    
//            	                    
//            	              
//            	   }
//            		   
//            		   
//            		   
//            		   
//            	   }
//            	   }
//}

	}

}
