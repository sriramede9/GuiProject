package Timeishere;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PersonFileFilter extends FileFilter {
	

	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		
		if(f.isDirectory()) {return true;}
		
		String filename=f.getName();
		String extension=Utils.getFileExtension(filename);
		if(extension==null) {
			return false;
		}
		if(extension.equals("per")) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Person database Files (*.per)";
	}

}
