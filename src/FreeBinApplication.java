import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;

public class FreeBinApplication extends JPanel implements ListSelectionListener {

	private JFrame frame;
	private JTextField txtFreeBi;
	private JPanel mainMenu;
	private JPanel panelSearch_1;
	private JPanel jacketListPanel;
	private JTextField descriptionTextField;
	private JTextField nameTextField;
	private JTextField timeTextField;
	private JTextField contactTextField;
	private JTextField imageUrlField;
	private DonateItem donateItemClass = new DonateItem();
	private NewItem newItemClass = new NewItem();
	private SelectItem selectItemClass = new SelectItem(donateItemClass);
	private JTextField categoryTextField;
	private JPanel thankYouForDonating;
	private JPanel donateItemPanel;
	private JPanel viewJacketItem;
	private JPanel viewScarfItem;
	private JPanel panel_thankyou;
	private JPanel scarfListPanel;
	private JList<String> jacket_List;
	DefaultListModel<String> listModel;
	private JTextArea textArea;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private String name;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FreeBinApplication window = new FreeBinApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FreeBinApplication() {
		listModel = new DefaultListModel();
		listModel.addElement("Item 1");
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 620, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));	
		panelSearch();
		
		JLabel BackGroundImageLabel = new JLabel("New label");
		BackGroundImageLabel.setBackground(new Color(0, 0, 51));
		Image img1=new ImageIcon(this.getClass().getResource("/SnowImage.jpg")).getImage();
		BackGroundImageLabel.setIcon(new ImageIcon(img1));

		BackGroundImageLabel.setBounds(0, 6, 620, 411);
		panelSearch_1.add(BackGroundImageLabel);
		jacketPanel();
		
		JLabel scarvesLabel = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/scarves1.jpg")).getImage();
		scarvesLabel.setIcon(new ImageIcon(img2));

		scarvesLabel.setBounds(-24, -3, 620, 430);
		jacketListPanel.add(scarvesLabel);
		mainMenuPanel();
		
		JLabel lblSnowbg = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/snowBackground1.jpg")).getImage();
		lblSnowbg.setIcon(new ImageIcon(img3));
		lblSnowbg.setBounds(0, 0, 620, 411);
		mainMenu.add(lblSnowbg);
		viewJacketItemPanel();
		
		JLabel lblJacket = new JLabel("New label");
		Image img5=new ImageIcon(this.getClass().getResource("/quilterJacket.jpg")).getImage();
		lblJacket.setIcon(new ImageIcon(img5));
		lblJacket.setBounds(6, 6, 608, 405);
		viewJacketItem.add(lblJacket);
		viewScarfItemPanel();
		
		JLabel scarfImagLabel = new JLabel("New label");
		Image img6=new ImageIcon(this.getClass().getResource("/scarfimg.jpg")).getImage();
		scarfImagLabel.setIcon(new ImageIcon(img6));
		scarfImagLabel.setBounds(0, 0, 620, 411);
		viewScarfItem.add(scarfImagLabel);
		thankyouPanel();
		
		JLabel lblFinal = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/finalImage.jpg")).getImage();
		lblFinal.setIcon(new ImageIcon(img4));
		lblFinal.setBounds(3, -2, 616, 417);
		panel_thankyou.add(lblFinal);
		donateItemPanel();
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img9=new ImageIcon(this.getClass().getResource("/quilterJacket.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img9));
		lblNewLabel.setBounds(0, 0, 698, 417);
		donateItemPanel.add(lblNewLabel);		
		thankYouForDonatingPanel();
		
		JLabel donationLabel = new JLabel("New label");
		Image img10=new ImageIcon(this.getClass().getResource("/finalImage.jpg")).getImage();
		donationLabel.setIcon(new ImageIcon(img10));
		donationLabel.setBounds(0, 0, 620, 411);
		thankYouForDonating.add(donationLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(98, 303, 208, 63);
		thankYouForDonating.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("We hope you're happy with your swag. \nThanks for choosing Swag Bin for all your winter needs. \nWe hope you come again!");
		textArea_1.setRows(2);
		textArea_1.setOpaque(false);
		textArea_1.setForeground(new Color(255, 204, 255));
		textArea_1.setFont(new Font("American Typewriter", Font.BOLD, 24));
		textArea_1.setBounds(6, 278, 506, 118);
		thankYouForDonating.add(textArea_1);
		
		
		
		mainMenu.setVisible(true);
		panelSearch_1.setVisible(false);
		jacketListPanel.setVisible(false);
		thankYouForDonating.setVisible(false);
		donateItemPanel.setVisible(false);
		viewJacketItem.setVisible(false);
		panel_thankyou.setVisible(false);
		
		
	}
	
	
	public JPanel thankYouForDonatingPanel(){
		
		thankYouForDonating = new JPanel();
		thankYouForDonating.setLayout(null);
		frame.getContentPane().add(thankYouForDonating, "name_125764428384798");
		
		JTextArea txtrThankYouFor = new JTextArea();
		txtrThankYouFor.setOpaque(false);
		txtrThankYouFor.setForeground(new Color(255, 255, 204));
		txtrThankYouFor.setFont(new Font("American Typewriter", Font.BOLD, 19));
		txtrThankYouFor.setText("Thank you for donating !\nWe will make sure your donated item meets a good owner!\nPlease expect messages from potential owners.\nWe hope you come again!");
		txtrThankYouFor.setRows(2);
		txtrThankYouFor.setBounds(24, 283, 574, 102);
		thankYouForDonating.add(txtrThankYouFor);
		
		JButton button = new JButton("Return to Main Menu");
		button.setForeground(new Color(102, 0, 51));
		button.setFont(new Font("American Typewriter", Font.PLAIN, 19));
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				
				mainMenu.setVisible(true);
				thankYouForDonating.setVisible(false);
				
			}
		});
		
		button.setBounds(100, 98, 372, 75);
		thankYouForDonating.add(button);
		
		return thankYouForDonating;
		
	}
	
	
	public JPanel donateItemPanel(){
		donateItemPanel = new JPanel();
		donateItemPanel.setBackground(new Color(255, 204, 255));
		donateItemPanel.setLayout(null);
		frame.getContentPane().add(donateItemPanel, "name_125269979980262");
		
		JLabel lblDonateItem = new JLabel("Donate Item");
		lblDonateItem.setForeground(new Color(102, 0, 102));
		lblDonateItem.setFont(new Font("American Typewriter", Font.PLAIN, 24));
		lblDonateItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonateItem.setBounds(181, 22, 179, 25);
		donateItemPanel.add(lblDonateItem);
		
		JLabel Image = new JLabel("Hello");
		Image.setHorizontalAlignment(SwingConstants.CENTER);
		Image.setBounds(25, 90, 185, 185);
		donateItemPanel.add(Image);
		
		JLabel itemDes = new JLabel("Item Description");
		itemDes.setForeground(new Color(102, 0, 102));
		itemDes.setFont(new Font("American Typewriter", Font.BOLD, 16));
		itemDes.setBounds(222, 95, 167, 16);
		donateItemPanel.add(itemDes);
		
		JLabel ownerName = new JLabel("Item Name\n");
		ownerName.setForeground(new Color(102, 0, 102));
		ownerName.setFont(new Font("American Typewriter", Font.BOLD, 16));
		ownerName.setBounds(222, 160, 167, 22);
		donateItemPanel.add(ownerName);
		
		JLabel contact = new JLabel("Contact Number");
		contact.setForeground(new Color(102, 0, 102));
		contact.setFont(new Font("American Typewriter", Font.BOLD, 16));
		contact.setBounds(222, 250, 167, 25);
		donateItemPanel.add(contact);
		
		JLabel time = new JLabel("Available Times?");
		time.setForeground(new Color(102, 0, 102));
		time.setFont(new Font("American Typewriter", Font.BOLD, 16));
		time.setBounds(222, 216, 167, 25);
		donateItemPanel.add(time);
		
		JButton btnDonateItem = new JButton("Donate Item!");
		btnDonateItem.setFont(new Font("American Typewriter", Font.PLAIN, 13));
		btnDonateItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				
				donateItemClass.getCurrentItem(newItemClass);
				donateItemClass.setDescription(descriptionTextField.getText());
				donateItemClass.setName(nameTextField.getText());
				donateItemClass.setOwnerContactInfo(contactTextField.getText());
				donateItemClass.setMeetingTime(timeTextField.getText());
				donateItemClass.setCategory(categoryTextField.getText());
				
				//Text.setText(model.roster.print());
				System.out.println(donateItemClass.getJacketList().head.getData().getDescription().toString());
				
				String name = nameTextField.getText();
				
				if(name.equals("") || alreadyInList(name)){
					Toolkit.getDefaultToolkit().beep();
					return;
				}
				
				
				int index = jacket_List.getSelectedIndex();
				if(index == -1){
					index = 0;
				}
				
				else{
					index++;
					
				}
				
				listModel.insertElementAt(name,index);
				jacket_List.setSelectedIndex(index);
				jacket_List.ensureIndexIsVisible(index);
				
				
				
				donateItemPanel.setVisible(false);
				thankYouForDonating.setVisible(true);
				
			}
		});
		btnDonateItem.setBounds(394, 323, 117, 29);
		donateItemPanel.add(btnDonateItem);
		
		JButton btnReturnToMain_1 = new JButton("Return to Main Menu");
		btnReturnToMain_1.setFont(new Font("American Typewriter", Font.PLAIN, 13));
		btnReturnToMain_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				mainMenu.setVisible(true);
				thankYouForDonating.setVisible(false);
				
			}
		});
		btnReturnToMain_1.setBounds(393, 364, 157, 29);
		donateItemPanel.add(btnReturnToMain_1);
		
		descriptionTextField = new JTextField();
		descriptionTextField.setBounds(401, 95, 190, 66);
		donateItemPanel.add(descriptionTextField);
		descriptionTextField.setColumns(10);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(401, 180, 190, 25);
		donateItemPanel.add(nameTextField);
		nameTextField.setColumns(10);
		
		timeTextField = new JTextField();
		timeTextField.setColumns(10);
		timeTextField.setBounds(401, 215, 190, 25);
		donateItemPanel.add(timeTextField);
		
		contactTextField = new JTextField();
		contactTextField.setColumns(10);
		contactTextField.setBounds(401, 249, 190, 25);
		donateItemPanel.add(contactTextField);
		
		JTextArea imageTextArea = new JTextArea();
		imageTextArea.setFont(new Font("American Typewriter", Font.PLAIN, 12));
		imageTextArea.setLineWrap(true);
		imageTextArea.setRows(2);
		imageTextArea.setText("To upload an image please\npaste an image url below:");
		imageTextArea.setBounds(25, 289, 188, 42);
		donateItemPanel.add(imageTextArea);
		
		imageUrlField = new JTextField();
		imageUrlField.setBounds(25, 343, 185, 25);
		donateItemPanel.add(imageUrlField);
		imageUrlField.setColumns(10);
		
		JButton btnUploadImage = new JButton("Upload Image");
		btnUploadImage.setFont(new Font("American Typewriter", Font.PLAIN, 13));
		btnUploadImage.setBounds(57, 380, 117, 29);
		donateItemPanel.add(btnUploadImage);
		
		JLabel category = new JLabel("Category(Jacket/Scarf)");
		category.setForeground(new Color(102, 0, 102));
		category.setFont(new Font("American Typewriter", Font.BOLD, 16));
		category.setBounds(222, 283, 167, 29);
		donateItemPanel.add(category);
		
		categoryTextField = new JTextField();
		categoryTextField.setColumns(10);
		categoryTextField.setBounds(401, 286, 190, 25);
		donateItemPanel.add(categoryTextField);
		
		return donateItemPanel;
	}
	
	
	protected boolean alreadyInList(String name){
		return listModel.contains(name);
	}
	
	public JPanel panelSearch()
	{
	
	 panelSearch_1 = new JPanel();
	 panelSearch_1.setBackground(new Color(0, 0, 102));
	 panelSearch_1.setForeground(Color.PINK);
	frame.getContentPane().add(panelSearch_1, "name_120656289831848");
	panelSearch_1.setLayout(null);
	
	JButton btnJackets = new JButton("Jackets");
	btnJackets.setFont(new Font("American Typewriter", Font.PLAIN, 26));
	btnJackets.setForeground(new Color(0, 0, 0));
	btnJackets.setBounds(212, 116, 165, 70);
	panelSearch_1.add(btnJackets);
	btnJackets.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			
			
			jacketListPanel.setVisible(true);
			panelSearch_1.setVisible(false);
			
			
			
		}
	});
	
	JButton btnScarves = new JButton("Scarves");
	btnScarves.setFont(new Font("American Typewriter", Font.PLAIN, 26));
	btnScarves.setForeground(new Color(0, 0, 0));
	btnScarves.setBounds(212, 200, 165, 70);
	panelSearch_1.add(btnScarves);
	btnScarves.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			
			
			scarfListPanel.setVisible(true);
			panelSearch_1.setVisible(false);
			
			
			
		}
	});
	
	return panelSearch_1;
	
	}
	
	public JPanel jacketPanel()
	{
	jacketListPanel = new JPanel();
	jacketListPanel.setBackground(new Color(51, 102, 204));
	frame.getContentPane().add(jacketListPanel, "name_121249248415121");
	jacketListPanel.setLayout(null);
	
	jacket_List = new JList<String>(listModel);
	jacket_List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	jacket_List.setSelectedIndex(0);
	jacket_List.addListSelectionListener(this);
	jacket_List.setVisibleRowCount(jacket_List.getModel().getSize());
	//JScrollPane listScrollPane = new JScrollPane(jacket_List);
	
	jacket_List.setBounds(22, 43, 174, 310);
	jacketListPanel.add(jacket_List);
	
	JButton btnViewItemInformation = new JButton("View Item Information");
	btnViewItemInformation.setFont(new Font("American Typewriter", Font.PLAIN, 24));
	btnViewItemInformation.setBackground(new Color(51, 255, 204));
	btnViewItemInformation.setForeground(new Color(51, 0, 153));
	btnViewItemInformation.setBounds(230, 107, 384, 60);
	jacketListPanel.add(btnViewItemInformation);
	btnViewItemInformation.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			
			
			 name = (String) jacket_List.getSelectedValue();
				
				System.out.println(name);
				
				DoublyLinkedListNode<ItemDonated> found = selectItemClass.findItem(name, "Jacket");
				
				System.out.println("FOUND " + found.getData().getDescription());
				
				textArea.setText(found.getData().getDescription());
				textArea_4.setText(found.getData().getName());
				textArea_2.setText(found.getData().getMeetingTime());
				textArea_3.setText(found.getData().getOwnerContactInfo());
				
				
				viewJacketItem.setVisible(true);
				jacketListPanel.setVisible(false);
			
			
			
		}
	});
	
	
	
	return jacketListPanel;
	}
	
	
	public JPanel viewJacketItemPanel(){
		viewJacketItem = new JPanel();
		frame.getContentPane().add(viewJacketItem, "name_121600579809425");
		viewJacketItem.setLayout(null);
		
		JLabel lblJacketItem = new JLabel("This is your Jacket!");
		lblJacketItem.setForeground(new Color(102, 0, 153));
		lblJacketItem.setFont(new Font("American Typewriter", Font.PLAIN, 26));
		lblJacketItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblJacketItem.setBounds(125, 24, 324, 25);
		viewJacketItem.add(lblJacketItem);
		
		JLabel lblHello = new JLabel("Hello");
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setBounds(25, 90, 185, 206);
		viewJacketItem.add(lblHello);
		
		JLabel lblDescription = new JLabel("Item Description");
		lblDescription.setBackground(new Color(0, 0, 0));
		lblDescription.setForeground(new Color(102, 0, 153));
		lblDescription.setFont(new Font("American Typewriter", Font.BOLD, 15));
		lblDescription.setBounds(216, 97, 158, 16);
		viewJacketItem.add(lblDescription);
		
		JLabel lblOwnerName = new JLabel("Item Name\n");
		lblOwnerName.setBackground(new Color(255, 51, 0));
		lblOwnerName.setForeground(new Color(102, 0, 153));
		lblOwnerName.setFont(new Font("American Typewriter", Font.BOLD, 15));
		lblOwnerName.setBounds(216, 184, 158, 22);
		viewJacketItem.add(lblOwnerName);
		
		JLabel lblOwnerContactNumber = new JLabel("Contact Number");
		lblOwnerContactNumber.setBackground(new Color(255, 255, 255));
		lblOwnerContactNumber.setForeground(new Color(102, 0, 153));
		lblOwnerContactNumber.setFont(new Font("American Typewriter", Font.BOLD, 15));
		lblOwnerContactNumber.setBounds(216, 252, 158, 25);
		viewJacketItem.add(lblOwnerContactNumber);
		
		JLabel lblAvailableMeetingTimes = new JLabel("Available Times?");
		lblAvailableMeetingTimes.setBackground(new Color(255, 255, 255));
		lblAvailableMeetingTimes.setForeground(new Color(102, 0, 153));
		lblAvailableMeetingTimes.setFont(new Font("American Typewriter", Font.BOLD, 15));
		lblAvailableMeetingTimes.setBounds(216, 218, 158, 25);
		viewJacketItem.add(lblAvailableMeetingTimes);
		
		 textArea = new JTextArea();
		textArea.setBounds(386, 95, 200, 74);
		viewJacketItem.add(textArea);
		
		 textArea_2 = new JTextArea();
		textArea_2.setBounds(385, 220, 201, 16);
		viewJacketItem.add(textArea_2);
		
	 textArea_3 = new JTextArea();
		textArea_3.setBounds(385, 254, 201, 16);
		viewJacketItem.add(textArea_3);
		
	 textArea_4 = new JTextArea();
		textArea_4.setBounds(386, 185, 201, 16);
		viewJacketItem.add(textArea_4);
		
		JButton btnBinIt = new JButton("Bin it!");
		btnBinIt.setForeground(new Color(0, 0, 102));
		btnBinIt.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		btnBinIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				selectItemClass.deleteItem(name, "Jacket");
				viewJacketItem.setVisible(false);
				panel_thankyou.setVisible(true);
				

			}
		});
		btnBinIt.setBounds(175, 326, 243, 29);
		viewJacketItem.add(btnBinIt);
		
		JButton btnFindSomethingElse = new JButton("Find something else!");
		btnFindSomethingElse.setForeground(new Color(0, 0, 102));
		btnFindSomethingElse.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		btnFindSomethingElse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				viewJacketItem.setVisible(false);
				panelSearch_1.setVisible(true);
				

			}
		});
		btnFindSomethingElse.setBounds(175, 367, 243, 29);
		viewJacketItem.add(btnFindSomethingElse);
		
		return viewJacketItem;
	}
	
	
	public JPanel viewScarfItemPanel(){
		
		viewScarfItem = new JPanel();
		viewScarfItem.setBackground(new Color(0, 0, 0));
		viewScarfItem.setLayout(null);
		frame.getContentPane().add(viewScarfItem, "name_124285282656712");
		
		JLabel lblScarfItem = new JLabel("Here is your scarf information..");
		lblScarfItem.setForeground(new Color(0, 153, 153));
		lblScarfItem.setBackground(new Color(0, 153, 153));
		lblScarfItem.setFont(new Font("American Typewriter", Font.BOLD, 24));
		lblScarfItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblScarfItem.setBounds(115, 19, 393, 43);
		viewScarfItem.add(lblScarfItem);
		
		JLabel label_img = new JLabel("Hello");
		label_img.setHorizontalAlignment(SwingConstants.CENTER);
		label_img.setBounds(25, 90, 185, 206);
		viewScarfItem.add(label_img);
		
		JLabel label_2 = new JLabel("Item Description");
		label_2.setBackground(new Color(102, 0, 153));
		label_2.setForeground(new Color(102, 0, 153));
		label_2.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		label_2.setBounds(222, 94, 130, 16);
		viewScarfItem.add(label_2);
		
		JLabel label_3 = new JLabel("Owner Name\n");
		label_3.setBackground(new Color(102, 0, 153));
		label_3.setForeground(new Color(102, 0, 153));
		label_3.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		label_3.setBounds(222, 181, 130, 22);
		viewScarfItem.add(label_3);
		
		JLabel label_4 = new JLabel("Contact Number");
		label_4.setBackground(new Color(102, 0, 153));
		label_4.setForeground(new Color(102, 0, 153));
		label_4.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		label_4.setBounds(222, 256, 144, 25);
		viewScarfItem.add(label_4);
		
		JLabel label_5 = new JLabel("Available Times?");
		label_5.setBackground(new Color(102, 0, 153));
		label_5.setForeground(new Color(102, 0, 153));
		label_5.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		label_5.setBounds(222, 222, 138, 25);
		viewScarfItem.add(label_5);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(386, 95, 200, 74);
		viewScarfItem.add(textArea_1);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(385, 220, 201, 16);
		viewScarfItem.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(385, 254, 201, 16);
		viewScarfItem.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(386, 185, 201, 16);
		viewScarfItem.add(textArea_7);
		
		JButton button = new JButton("Bin it!");
		button.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		//button.setColo(0, 0, 102)
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				viewScarfItem.setVisible(false);
				panel_thankyou.setVisible(true);
				

			}
		});
		button.setForeground(new Color(0, 0, 102));
		button.setBounds(175, 326, 243, 29);
		viewScarfItem.add(button);
		
		JButton button_1 = new JButton("Find something else!");
		button_1.setFont(new Font("American Typewriter", Font.PLAIN, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				viewJacketItem.setVisible(false);
				panelSearch_1.setVisible(true);
				

			}
		});
		button_1.setForeground(new Color(0, 0, 102));
		button_1.setBounds(175, 367, 243, 29);
		viewScarfItem.add(button_1);
		
		return viewScarfItem;
		
	}
	
	public JPanel thankyouPanel(){
		
		panel_thankyou = new JPanel();
		frame.getContentPane().add(panel_thankyou, "name_124389227619899");
		panel_thankyou.setLayout(null);
		
		JTextArea txtrWeHopeYoure = new JTextArea();
		txtrWeHopeYoure.setOpaque(false);
		txtrWeHopeYoure.setForeground(new Color(255, 204, 255));
		//txtrWeHopeYoure.setBackground(new Color(255, 255, 255));
		txtrWeHopeYoure.setFont(new Font("American Typewriter", Font.BOLD, 24));
		txtrWeHopeYoure.setBounds(3, 272, 616, 118);
		txtrWeHopeYoure.setRows(2);
		txtrWeHopeYoure.setText("We hope you're happy. \nThanks for choosing Swag Bin \nfor all your winter needs. We hope you come again!");
		panel_thankyou.add(txtrWeHopeYoure);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setFont(new Font("American Typewriter", Font.PLAIN, 24));
		btnReturnToMain.setForeground(new Color(51, 0, 0));
		btnReturnToMain.setBackground(new Color(0, 0, 102));
		btnReturnToMain.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			mainMenu.setVisible(true);
			panel_thankyou.setVisible(false);

		}
	});
		
		btnReturnToMain.setBounds(100, 98, 372, 75);
		panel_thankyou.add(btnReturnToMain);
		
		return panel_thankyou;
	}
	
	
	
	public JPanel mainMenuPanel(){
		mainMenu = new JPanel();
		frame.getContentPane().add(mainMenu, "name_120652915081788");
		mainMenu.setLayout(null);
		
		txtFreeBi = new JTextField();
		txtFreeBi.setBackground(new Color(204, 204, 204));
		txtFreeBi.setForeground(new Color(0, 0, 0));
		txtFreeBi.setFont(new Font("American Typewriter", Font.PLAIN, 28));
		txtFreeBi.setHorizontalAlignment(SwingConstants.CENTER);
		txtFreeBi.setText("Swag Bin");
		txtFreeBi.setBounds(165, 32, 299, 83);
		mainMenu.add(txtFreeBi);
		txtFreeBi.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setFont(new Font("American Typewriter", Font.PLAIN, 18));
		searchButton.setBackground(new Color(0, 0, 153));
        searchButton.setContentAreaFilled(false);
        searchButton.setOpaque(true);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				panelSearch_1.setVisible(true);
				mainMenu.setVisible(false);
                // these next two lines do the magic..
				


			}
		});
		searchButton.setBounds(76, 208, 162, 40);
		mainMenu.add(searchButton);
		
		JButton donateButton = new JButton("Donate");
		donateButton.setFont(new Font("American Typewriter", Font.PLAIN, 18));
		searchButton.setFont(new Font("American Typewriter", Font.PLAIN, 18));
		donateButton.setBackground(new Color(0, 0, 153));
		donateButton.setContentAreaFilled(false);
		donateButton.setOpaque(true);
		donateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				newItemClass.createObject();
				mainMenu.setVisible(false);
				donateItemPanel.setVisible(true);
				
				
				
			}
		});
		donateButton.setBounds(392, 208, 156, 40);
		mainMenu.add(donateButton);
		
		return mainMenu;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
