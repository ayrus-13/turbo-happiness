package com.cg.labtwo;

abstract class MediaItem extends Item{
	private int runtime;

	public MediaItem(int bookId, String title, int noCopies,int runtime) {
		super(bookId, title, noCopies);
		this.runtime=runtime;
		
	}
	
}