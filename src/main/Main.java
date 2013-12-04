package main;

import java.io.File;

import compression.Huffman;

import tools.Tools;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Huffman c = new Huffman("abracadabra");
		Huffman c = new Huffman("abracad");
		
		c.compression();
		System.out.println(c.getCode());
		//System.out.println(c.getA() == null);
		System.out.println("THE LAST ARBRE ====");
		System.out.println(c.getA().toString());
		System.out.println(c.getA() == null);
	}

}
