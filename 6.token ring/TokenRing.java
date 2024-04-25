package ds5;

import java.util.Scanner;

public class TokenRing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of node you want in Ring");
		int n=sc.nextInt();
		
		System.out.println("Ring Formed is as followed: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("0");
		
		int choice=0;
		
		do {
			System.out.println("Enter Sender: ");
			int sender=sc.nextInt();
			
			System.out.println("Enter Reciever: ");
			int Reciever=sc.nextInt();
			
			System.out.println("Enter Data: ");
			int data=sc.nextInt();
			
			int token=0;
			
			
			System.out.println("Token Passing : ");
			for(int i=token;i<sender;i++)
			{
				System.out.print(" "+i+"->");
			}
			System.out.println(" " + sender);
			
			
			
			System.out.println("Sender: "+sender +" Sending data: "+data);
			for(int i=sender;i!=Reciever;i=(i+1)%n) {
				System.out.println("data "+data+" Forwarded by "+i);
				
			}
			System.out.println("Reciever: "+Reciever +" Received the  data: "+data);
			
			token=sender;
			System.out.println("Do you want to send data again? if YES Enter 1,IF no Enter 0");
			choice=sc.nextInt();
		}while(choice==1);
		sc.close();
	}

}
