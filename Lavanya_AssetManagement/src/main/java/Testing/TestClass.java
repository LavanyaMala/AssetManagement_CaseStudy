package Testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import com.java.model.Asset;


import com.java.demo.dao.AssetManageServiceImple;

public class TestClass {
    private AssetManageServiceImple assetService;

    @Before
    public void setUp() {
        
        assetService = new AssetManageServiceImple();
    }

    @Test
    public void testAddAsset() {
        
        Asset asset = new Asset();
        
        asset.setAsset_id(210); 
        asset.setName("Printer");
        asset.setType("Office Equipment");
        asset.setSerial_number(1011);
        asset.setPurchase_date("2024-01-10");
        asset.setLocation("Office 2");
        asset.setStatus("In Use");
        asset.setOwner_id(103); 

        assertTrue(assetService.addAsset(asset));
    }
    
    
}
