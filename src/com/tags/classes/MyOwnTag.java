package com.tags.classes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyOwnTag extends SimpleTagSupport
{
public void doTag() throws JspException, IOException
{
	
JspWriter out = getJspContext().getOut();
BufferedImage img = null;
try {
    img = ImageIO.read(new File("image.jpg"));
} catch (IOException e) {
}
}
}