import java.awt.*;
import java.awt.event.*;

class BgComputeBill extends Frame implements ActionListener
{
  Dialog d;
  Label l1,l2,l3,l4;
  TextField t1,t2,t3,t4;
  Button b1,b2;
  Image im;
 
BgComputeBill()
   {
     
     im=Toolkit.getDefaultToolkit().createImage( "thumb1622.JPG");
     setTitle("ELECTRI BILL GENERATOR");
     setVisible(true);
     setSize(400,400);
     setResizable(true);
     setLayout(null);
     setBackground(Color.cyan);

     l1=new Label("  LAST MONTH UNIT");l1.setBackground(Color.PINK);l1.setBounds(100,100,135,25);add(l1);
     l2=new Label("CURRENT MONTH UNIT");l2.setBackground(Color.PINK);l2.setBounds(100,150,135,25);add(l2);
     l3=new Label("      BILL AMOUNT");l3.setBackground(Color.PINK);l3.setBounds(100,250,135,25);add(l3);
     l4=new Label("    UNIT ADVANCED");l4.setBackground(Color.PINK);l4.setBounds(100,200,135,25);add(l4);

     t1=new TextField();t1.setBounds(250,100,100,25);add(t1);t1.setFont(new Font("Arial",Font.BOLD,15));
     t2=new TextField();t2.setBounds(250,150,100,25);add(t2);t2.setFont(new Font("Arial",Font.BOLD,15));
     t3=new TextField();t3.setBounds(250,250,100,25);add(t3);t3.setFont(new Font("Arial Black",Font.BOLD,12));
     t4=new TextField();t4.setBounds(250,200,100,25);add(t4);t4.setFont(new Font("Arial",Font.BOLD,15));//t4.setColor(new Color(200,0,0));


      
     b1=new Button("GET BILL AMOUNT");b1.setBackground(Color.yellow); b1.setBounds(150,300,125,25);add(b1); 
     b1.addActionListener(this);
     b2=new Button("GET DETAILS ");b2.setBackground(Color.GREEN); b2.setBounds(150,350,125,25);add(b2); 
     b2.addActionListener(this);
    
   }
   public void paint(Graphics g)
   {
     g.drawImage(im,0,0,400,400,this);
    }
  
  public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==b1)
       {
        int n1= Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());
        int n3=n2-n1;
            if(n3<0)
             {
               t4.setText("wrong input");
              }
           else
             {
               t4.setText(""+(n3));
              }
         
         if(n3>=0 && n3<=50)
           {
            t3.setText(" "+(n3*3)+" Rupees");
             }
            
          else if(n3>=51 && n3<=200)
           {
            t3.setText(" "+((50*3.0f)+(n3-50)*4.8f+" Rupees"));
             }
          else if(n3>=201 && n3<=400) 
          {
            t3.setText(" "+((50*3.0f)+(150*4.8f)+(n3-200)*5.8f+" Rupees"));
             }
          else if(n3>400)
          {
           t3.setText(" "+((50*3.0f)+(150*4.8f)+(200*5.8f)+(n3-400)*6.2f+" Rupees"));
             }
          else
          t3.setText(" "+(" wrong input"));
          }
        
       if(e.getSource()==b2)
         {
            d=new Dialog(BgComputeBill.this);
            d.setTitle("BILL DETAILS");
            d.setSize(200,300);
            d.setVisible(true);
            int n= Integer.parseInt(t1.getText());
            TextField t=new TextField();add(t);t.setBounds(50,10,50,20);t.setText(""+n);
            

             Button b7=new Button();add(b7);b7.setBounds(100,25,50,20);
   
         }
      }


      public static void main(String args[])
       {
        new BgComputeBill();
        }
}


     
  
