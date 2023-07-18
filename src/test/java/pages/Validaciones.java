package pages;


import Utils.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utils.AppiumDriverFactory;
import Utils.AndroidUtils;

import java.util.concurrent.TimeUnit;

public class Validaciones {

    private String Titulo = ConfigFileReader.getConfigPropertyVal("titulo");
    private String Descripcion = ConfigFileReader.getConfigPropertyVal("descripcion");
    private String Apellido = ConfigFileReader.getConfigPropertyVal("apellido");
    AppiumDriver driver = null;
    AndroidUtils androidUtils;
    private static final By header_logo = By.className("android.widget.ImageView");
    private static final By header_logo2 = By.className("android.widget.TextView");
    private static final By header_logo3 = By.className("android.widget.LinearLayout");

    public void abrirApp() {
        try {
            // driver.resetApp();
            AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
            //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver = appiumDriverFactory.getDriver();
        } catch (Exception e) {
            AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
            //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver = appiumDriverFactory.getDriver();
        }


    }

    public void Ingreso() {
        driver.resetApp();
        androidUtils = new AndroidUtils(driver);
        if (androidUtils.objectExists(header_logo3)) {
            try {
                WebElement clicForms = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
                clicForms.click();
            } catch (Exception e) {

            }
            try {
                WebElement clicForms2 = driver.findElement(By.id("com.heartfull.forms:id/button_next"));
                clicForms2.click();
                WebElement clicAceptar = driver.findElement(By.id("com.heartfull.forms:id/button_next"));
                clicAceptar.click();
                WebElement clicForms3 = driver.findElement(By.id("com.heartfull.forms:id/button_next"));
                clicForms3.click();
            } catch (Exception e) {
            }
            try {
                WebElement clicEmail = driver.findElement(By.className("android.widget.CheckedTextView"));
                clicEmail.click();
                WebElement clicAceptar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
                clicAceptar.click();
            } catch (Exception e) {

            }

            Assert.assertTrue(true, "Application Launched Successfully!");

        } else if (androidUtils.objectExists(header_logo2)) {
            System.out.println("Application Launched!");
            WebElement clicGoogle = driver.findElement(By.className("android.widget.ImageButton"));
            clicGoogle.click();
            WebElement clicGoogle2 = driver.findElement(By.className("android.widget.ImageButton"));
            clicGoogle2.click();
            Assert.assertTrue(true, "Application Launched Successfully!");

        } else if (androidUtils.objectExists(header_logo)) {
            System.out.println("Application Launched!");
            Assert.assertTrue(true, "Application Launched Successfully!");
        } else {
            Assert.assertTrue(false, "Unable to launch application!");
        }
    }

    /*   public void cedulaCiudadania(){
           WebElement dropdown_element = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Seleccione tipo de documento\"]"));
           dropdown_element.click();
           WebElement  option_element = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cedula de ciudadania\"]"));
           option_element.click();

       }
       public void datos(){
           WebElement contrasena = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
           contrasena.click();
           contrasena.sendKeys("wilmer123");
           WebElement numero_Documento = driver.findElementByClassName("android.widget.EditText");
           numero_Documento.click();
           numero_Documento.sendKeys("1004005681");
       }
       public void closedApp(){
           driver.quit();
       }
   */
    public void closedApp() {
        if(androidUtils.objectExists(By.id("com.heartfull.forms:id/textview_board_description"))){
            driver.closeApp();
        } else {
            driver.resetApp();
        }
    }

    public void DarClic() {
        WebElement clic = driver.findElement(By.id("com.heartfull.forms:id/button_general_form_type"));
        clic.click();
    }

    public void Formulario1() {
        WebElement formulario1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView"));
        formulario1.click();
    }

    public void Titulo() {
        WebElement titulo = driver.findElement(By.id("com.heartfull.forms:id/edt_form_compose_title"));
        titulo.click();
    }

    public void IngresoTitulo() {
        WebElement TituloFormulario = driver.findElement(By.id("com.heartfull.forms:id/edt_form_compose_title"));
        TituloFormulario.sendKeys(Titulo);
    }

    public void IngresoDescripcion() {
        WebElement descripcion = driver.findElement(By.id("com.heartfull.forms:id/edt_form_compose_description"));
        descripcion.clear();
        WebElement descripcion2 = driver.findElement(By.id("com.heartfull.forms:id/edt_form_compose_description"));
        descripcion2.sendKeys(Descripcion);
    }


}