package pattern.composite;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		FileGeneral rootFolder = new MyFolder("C≈Ã");
		FileGeneral secondFolder = new MyFolder("windows");
		FileGeneral firstFile = new MyFile("SomethingFirst");
		FileGeneral secondFile = new MyFile("SomethingSecond");
		
		rootFolder.add(secondFolder);
		rootFolder.add(firstFile);
		secondFolder.add(secondFile);
		
		displayTree(rootFolder,0);
	}
	
	public static void displayTree(FileGeneral fg, int deep) {
		
		for(int i = 0 ; i < deep ; i++) {
			System.out.print("--");
		}
		
		fg.display();
		
		List<FileGeneral> child = fg.getChild();
		for(FileGeneral fgTmp : child) {
			if(fgTmp instanceof MyFile) {
				for(int i = 0 ; i <= deep ; i++) {
					System.out.print("--");
				}
				fgTmp.display();
			}else {
				displayTree(fgTmp,deep + 1);
			}
		}
	}
}
