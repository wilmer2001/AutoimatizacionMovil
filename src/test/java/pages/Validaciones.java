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

    private String Titulo = ConfigFileReader.getData("titulo");
    private String Nombre = ConfigFileReader.getData("nombre");
    private String Apellido = ConfigFileReader.getData("apellido");



    AppiumDriver driver = null;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    private static final By header_logo = By.className("android.widget.ImageView");
    public void Ingreso(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        if(androidUtils.objectExists(header_logo)){
            System.out.println("Application Launched!");
            Assert.assertTrue(true,"Application Launched Successfully!");
        }else{
            Assert.assertTrue(false,"Unable to launch application!");
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
 public void closedApp(){
     driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
     driver.quit();
 }
    public void DarClic(){
        WebElement clic = driver.findElement(By.id("com.heartfull.forms:id/button_form_type_chooser"));
        clic.click();
        WebElement ClicFormulario = driver.findElement(By.id("com.heartfull.forms:id/button_general_form_type"));
        ClicFormulario.click();
    }
    public void Formulario1(){
        WebElement formulario1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView"));
        formulario1.click();
    }
    public void Titulo(){
     WebElement titulo = driver.findElement(By.id("com.heartfull.forms:id/edt_form_compose_title"));
     titulo.click();
     titulo.sendKeys(Titulo);
    }
}