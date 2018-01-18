
//import static TeacherUI.teacher;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp-
 */
public class StudentUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentUI
     */
     //static TeacherData teacher;
 
    //public static TeacherData teacher;
    public static Socket socket;
    public static ObjectOutputStream doout;
    public static ObjectInputStream doin;
    public static DataOutputStream dout;
    public static DataInputStream din;
   // DataOutputStream d;
    BufferedReader in;
    String str;
    public static StudentData msgStudent;
    //TeacherData msgTeacher;
    private int PORT;
    private String HOST;
    //static TeacherUIData teacherUiData;
    public StudentUI(ObjectOutputStream doout,ObjectInputStream doin,DataOutputStream dout,DataInputStream din,Socket socket,StudentData msgStudent) {
        this.msgStudent=msgStudent;
//        msgStudent=new StudentData();
        //msgTeacher=new TeacherData();
        
        this.socket =socket;
        this.doout=doout;  
        this.doin=doin;
        this.dout=dout;
        this.din=din;
        msgStudent.setRequest(7);
        initComponents();
        refreshButtonActionPerformed(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new 
        WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                    
        }

            private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        subtopicList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT");

        courseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(courseList);

        subtopicList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        subtopicList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtopicListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(subtopicList);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COURSES");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUB-TOPICS");

        refreshButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        searchButton.setText("Search By Teacher ");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseListMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            try{

                String selectedItem =  ((CourseData)courseList.getSelectedValue()).getCourseName();
                FetchSubtopicData fData=new FetchSubtopicData();
                fData.setRequest(8);
                fData.setCourseName(selectedItem);
                DefaultListModel model = new DefaultListModel();
                doout.writeObject(fData);
                String str=(String)din.readUTF();
                int reference= Integer.parseInt(str);
                if(reference == 1)
                {
                    model=(DefaultListModel)doin.readObject();

                    subtopicList.setModel(model);
                    //model.addElement(selectedItem);

                }
                else JOptionPane.showMessageDialog(this, "No data to fetch!!");
            }
            catch(Exception e){
                System.out.println("Unable to fetch Data");
            }
        }

    }//GEN-LAST:event_courseListMouseClicked

    private void subtopicListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtopicListMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            try{
           String selectedItem = (String) subtopicList.getSelectedValue();
           // add selectedItem to your second list.
           FetchSubtopicData fData=new FetchSubtopicData();
           fData.setRequest(10);
           fData.setCourseName(((CourseData)courseList.getSelectedValue()).getCourseName());
           fData.setSubtopicName(selectedItem);
             new StudentVideos(socket,doout,doin,dout,din,fData,msgStudent,1).setVisible(true);

            }
            catch(Exception e){
                System.out.println("Unable to fetch Data");
            }
        }

    }//GEN-LAST:event_subtopicListMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        try{
            // teacher.setRequest(7);
              StudentData studentData=new StudentData();
            studentData.setEmail(msgStudent.getEmail());
            studentData.setName(msgStudent.getName());
            studentData.setPassword(msgStudent.getPassword());
            studentData.setUsername(msgStudent.getUsername());
            studentData.setRequest(12);
            System.out.println("Sending");
            doout.writeObject(studentData);
            System.out.println("Sent");
            System.out.println("Receiving");
            String str=(String)din.readUTF();
            System.out.println("Received");
            int response= Integer.parseInt(str);
            DefaultListModel<CourseData> model=new DefaultListModel();
            if(response==1){
                System.out.println("Receiving List");
                model=(DefaultListModel)doin.readObject();
                System.out.println("Received List");
                courseList.setModel(model);
                courseList.setCellRenderer(new CourseRenderer());
                //courseList.setModel((ListModel) new CountryRenderer());
                courseList.addMouseListener(new PopClickListenerStudent(courseList));
                DefaultListModel model2=new DefaultListModel();

                subtopicList.setModel(model2);
                // subtopicList.setModel((ListModel) new CountryRenderer());
            }
            else JOptionPane.showMessageDialog(this, "No data to fetch");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Unable to connect!!");;
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
         FetchSubtopicData fData=new FetchSubtopicData();
         if(searchTextField.getText().isEmpty()){
             try{
             JOptionPane.showMessageDialog(this, "Please enter valid value");
             }
             catch(Exception e){
                 
             }
                     
         }
         else{
           fData.setRequest(10);
           fData.setTeacherName(searchTextField.getText());
            new StudentVideos(socket,doout,doin,dout,din,fData,msgStudent,2).setVisible(true);
         }
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUI(doout,doin,dout,din,socket,msgStudent).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList courseList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JList subtopicList;
    // End of variables declaration//GEN-END:variables
}
class PopUpDemoStudent extends JPopupMenu {
    JMenuItem anItem;
    //Object obj;
    public PopUpDemoStudent(JList jList){
        //this.obj=obj;
        anItem = new JMenuItem("Rate");
        anItem.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //JOptionPane.showMessageDialog(null,"Video deleted");
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Rate.perform(jList,StudentUI.doout);
                //JOptionPane.showMessageDialog(null,((CourseData)jList.getSelectedValue()).getCourseName());
                //CourseData courseData=new CourseData(e.getSource()., WIDTH)
                //JOptionPane.showMessageDialog(null,"Video deleted");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //Video vid=(Video)obj;
                //JOptionPane.showMessageDialog(null," Video deleted");
                //Rate.main(null);
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(anItem);
    }
}
class PopClickListenerStudent extends MouseAdapter {
    JList jList;
    public PopClickListenerStudent(JList jList){
        this.jList=jList;
    }
    public void mousePressed(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
        jList.setSelectedIndex((jList.locationToIndex(e.getPoint())));
        
    }

    public void mouseReleased(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
    }

    private void doPop(MouseEvent e){
        PopUpDemoStudent menu = new PopUpDemoStudent(jList);
        menu.show(e.getComponent(), e.getX(), e.getY());
    
    }
}