package view;
import javax.swing.JOptionPane;
import bubblesort.BubbleSort;
import mergiosort.Merge_Sort;
public class Principal {

	public static void main(String[] args) {
		Merge_Sort pc = new Merge_Sort();
		BubbleSort nc = new BubbleSort();
		
		int[] VetorEx1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] VetorEx2 = {44, 43, 42, 41, 40, 39, 38};
		int opc = 0;
		do
		opc = Integer.parseInt(JOptionPane.showInputDialog("1 - vetor do Ex1 em BubbleSort \n 2 - vetor do Ex2 em BubbleSort \n 3 - Vetor do Ex1 em MergeSort \n 4 - Vetor do Ex2 em MergeSort"));
		while(opc == 0);
		if(opc == 1) { 
			VetorEx1 = nc.bubble_sort(VetorEx1);
				for(int i = 0; i < VetorEx1.length; i++) {
					System.out.print(VetorEx1[i] + " ");
				}
				System.out.println("Bubble!");
		}
		else if(opc == 2) {
			VetorEx2 = nc.bubble_sort(VetorEx2);
		for(int i = 0; i < VetorEx2.length; i++) {
			System.out.print(VetorEx2[i]+" ");
		}
		System.out.println("Bubble2");
		}
		else if(opc == 3) {
			VetorEx1 = pc.MergeSort(VetorEx1, 0, VetorEx1.length - 1);
			for(int i = 0; i < VetorEx1.length; i++) {
				System.out.print(VetorEx1[i]+ " ");
			}
			System.out.println("Merge!");
		}
		else {
			VetorEx2 = pc.MergeSort(VetorEx2, opc, VetorEx2.length -1);
		for(int i = 0; i < VetorEx2.length; i++) {
			System.out.print(VetorEx2[i]+ " ");
		}
		System.out.println("Merge2");
		}
	}
}