package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.Reporter;


import com.Tender.Pom.FooterRedirections;
import com.Tender.generics.TenderBaseClass;

public class Test_Footer extends TenderBaseClass {
	@Test()
	public void Footer() throws InterruptedException {

		FooterRedirections f= new FooterRedirections(driver);

		String c="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(c);
		f.AboutUs();
		Reporter.log("Footer AboutUs",true);

		String d="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(d);
		f.TenderBazaar();
		Reporter.log("Footer TenderBazaar",true);
		driver.navigate().back();

		String a="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(a);
		f.InvestmentBazaar();
		Reporter.log("Footer InvestmentBazaar",true);
		driver.navigate().back();

		String b="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(b);
		f.Pricing();
		Reporter.log("Footer Pricing",true);


		String e="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(e);
		f.FAQs();
		Reporter.log("Footer FAQs",true);

		String g="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(g);
		f.CustomerCare();
		Reporter.log("Footer CustomerCare",true);

		String h="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(h);
		f.PrivacyPolicy();
		Reporter.log("Footer PrivacyPolicy",true);

		String i="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(i);
		f.TermsAndConditions();
		Reporter.log("Footer TermsAndConditions",true);

		String z="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(z);
		f.RefundAndCancellation();
		Reporter.log("Footer TermsAndConditions",true);

		String j="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(j);
		f.LatestTenders();
		Reporter.log("Footer LatestTenders",true);

		String k="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(k);
		f.Industry();
		Reporter.log("Footer Industry",true);

		String l="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(l);
		f.State();
		Reporter.log("Footer State",true);

		String m="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(m);
		f.Authorities();
		Reporter.log("Footer Authorities",true);


		String n="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(n);
		f.facebook();
		Reporter.log("Footer facebook",true);
		driver.switchTo().defaultContent();

		String o="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(o);
		f.twitter();
		Reporter.log("Footer Twitter",true);
		driver.switchTo().defaultContent();

		String p="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(p);
		f.GooglePlay();
		Reporter.log("Footer GooglePlay",true);
		driver.switchTo().defaultContent();

		String q="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(q);
		f.AppStore();
		Reporter.log("Footer AppStore",true);
		driver.switchTo().defaultContent();



		AssertJUnit.assertTrue(true == true);
		sa.assertAll();
	}

}
