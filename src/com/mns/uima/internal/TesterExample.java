package com.mns.uima.internal;

import com.mnsuk.uima.NLC;


public class TesterExample {
	public static void main(String[] args) {
		String CASFile1 = "/Users/martin/Documents/Development/Java/Annotators/NLC/data/nlc.xmi";  // _InitialView
		String fileType1 = "/Users/martin/Documents/Development/Java/Annotators/NLC/desc/debug-ts.xml";  // _InitialView

		NLC anno = new NLC();
		anno.setPUsername("username");
		anno.setPPassword("password");
		anno.setPClassifier("classifier id");
		anno.setPTopOnly(false);
		anno.setPThreshold(0.0);
		anno.TestAnnotator( fileType1, CASFile1);

	}
}
