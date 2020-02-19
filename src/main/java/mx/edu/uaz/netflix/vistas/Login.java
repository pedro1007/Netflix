package mx.edu.uaz.netflix.vistas;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

public class Login extends CustomLayout {
	private TextField tfUsuario;
	private PasswordField pfContra;
	private Button btnIniciar, btnAyuda, btnFace, btnSus;
	private CheckBox chkRecuerda;
	
	public Login() {
		this.setPrimaryStyleName("principal");
		this.setTemplateName("login");
		this.setSizeFull();
		this.setResponsive(true);
		
		tfUsuario = new TextField();
		//tfUsuario.setPlaceholder("Email o número de teléfono");
		
		this.addComponent(tfUsuario, "usuario");
		
		
		pfContra = new PasswordField();
		pfContra.setPlaceholder("Contraseña");
		this.addComponent(pfContra, "password");
		
		btnIniciar = new Button("Iniciar Sesión");
		btnIniciar.setPrimaryStyleName("btn-login");
		this.addComponent(btnIniciar, "ingresar");
		
		chkRecuerda = new CheckBox("Recuérdame");
		this.addComponent(chkRecuerda, "recuerdame");
		
		btnAyuda = new Button("¿Necesitas ayuda?");
		btnAyuda.setStyleName(ValoTheme.BUTTON_LINK);
		this.addComponent(btnAyuda, "ayuda");
		
		btnFace = new Button("Iniciar sesión con Facebook");
		this.addComponent(btnFace, "face");
		
		btnSus = new Button("Suscríbete ya.");
		this.addComponent(btnSus, "suscribete");
		
	}
	
}
