package Core;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
public class Type1 
{
	public PdfWriter getWriter(Document document,String s) throws FileNotFoundException, DocumentException
	{
		PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(s));
		document.open();
		return writer;
		
	}
	public void close(Document document)
	{
		document.close();
	}
	public void border(PdfWriter writer)
	{
		PdfContentByte canvas = writer.getDirectContentUnder();
		canvas.setLineWidth(5);
		canvas.setRGBColorFill(255,255,255);
		canvas.rectangle(5,5,585,830);
		canvas.fillStroke();
	}
	public int createHeader(PdfWriter w,int verticalindex,String string,Document d) throws FileNotFoundException, DocumentException
	{
		int headspace=25;
		String f;
		PdfWriter writer=w;
		Phrase h=new Phrase();
	    FontFactory.register("c:/windows/fonts/Cinzel-Bold.ttf", "Cinzel-Bold");
	    Font font=FontFactory.getFont("Cinzel-Bold", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 20);
		ColumnText ct=new ColumnText(writer.getDirectContent());
		h.add(new Paragraph(string,font));
		ct.setAlignment(Element.ALIGN_LEFT);
		ct.setSimpleColumn(25,0,600,verticalindex+20);
		ct.setText(h);
		ct.go();
		verticalindex=verticalindex-headspace;
	    return verticalindex;
	}
	public void underLine(PdfWriter writer,Document doc,int w,int pos) throws DocumentException
	{
		PdfContentByte canvas = writer.getDirectContentUnder();
		LineSeparator UNDERLINE1 = new LineSeparator(00,w,BaseColor.BLACK, Element.ALIGN_CENTER,pos);
		doc.add(UNDERLINE1);
	}
	public int normalText(PdfWriter writer,int verticalindex,String string) throws DocumentException
	{
		int normalspace=20;
		Phrase b=new Phrase();
		FontFactory.register("c:/windows/fonts/JosefinSlab-Regular.ttf", "JosefinSlab-Regular");
	    Font font=FontFactory.getFont("JosefinSlab-Regular", BaseFont.IDENTITY_H, BaseFont.EMBEDDED,12);
		PdfContentByte canvas = writer.getDirectContentUnder();
		ColumnText ct=new ColumnText(writer.getDirectContent());
		b.add(new Paragraph(string,font));
		ct.setAlignment(Element.ALIGN_LEFT);
		ct.setSimpleColumn(25,0,600,verticalindex+20);
		ct.setText(b);
		ct.go();
		verticalindex=verticalindex-normalspace;
	    return verticalindex;
	}
	public int createSubHeader(PdfWriter writer,int verticalindex,String string) throws DocumentException
	{
		int normalspace=21;
		Phrase b=new Phrase();
		FontFactory.register("c:/windows/fonts/Cinzel-Regular.ttf", "Cinzel-Regular");
	    Font font=FontFactory.getFont("Cinzel-Regular", BaseFont.IDENTITY_H, BaseFont.EMBEDDED,15);
		PdfContentByte canvas = writer.getDirectContentUnder();
		ColumnText ct=new ColumnText(writer.getDirectContent());
		b.add(new Paragraph(string,font));
		ct.setAlignment(Element.ALIGN_LEFT);
		ct.setSimpleColumn(25,0,600,verticalindex+20);
	    ct.setText(b);
	    ct.go();
		verticalindex=verticalindex-normalspace;
	    return verticalindex;
	}
	public int paragraphText(PdfWriter writer,int verticalindex,String string) throws DocumentException
	{
		int normalspace=18;
		Phrase intro=new Phrase();
		FontFactory.register("c:/windows/fonts/JosefinSlab-Regular.ttf", "JosefinSlab-Regular");
		   Font font=FontFactory.getFont("JosefinSlab-Regular", BaseFont.IDENTITY_H, BaseFont.EMBEDDED,10);
			PdfContentByte canvas = writer.getDirectContentUnder();
			ColumnText ct=new ColumnText(writer.getDirectContent());
			intro.add(new Paragraph(string,font));
			ct.setAlignment(Element.ALIGN_LEFT);
			  ct.setSimpleColumn(25,0,560,verticalindex+20);
			   ct.setText(intro);
			   ct.go();
		   int l=string.length();
		   System.out.println(l);
		   int i=0;
		   do
		   {
		   verticalindex=verticalindex-normalspace;
		  i=i+138;
		   }while(i<string.length());
		   verticalindex=verticalindex-24;
		   return verticalindex;
	}
	void newPage(Document document)
	{
		document.newPage();
		
	}
}
