package com.vis.api.ticket.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vis.api.ticket.model.asset.AssetModel;

@Service
public class AssetService {
	
	public List<AssetModel> getAsset(String type) {
		List<AssetModel>  assets = new ArrayList<>();
		AssetModel asset1 = new AssetModel();
		asset1.setId("ETH");
		asset1.setType(type);
		asset1.setDesc("Ethereum");
		assets.add(asset1);
		
		AssetModel asset2 = new AssetModel();
		asset2.setId("BTC");
		asset2.setType(type);
		asset2.setDesc("Bitcoin");
		assets.add(asset2);
		
		AssetModel asset3 = new AssetModel();
		asset3.setId("BNB");
		asset3.setType(type);
		asset3.setDesc("Binance Coin");
		assets.add(asset3);
		
		AssetModel asset4 = new AssetModel();
		asset4.setId("USDT");
		asset4.setType(type);
		asset4.setDesc("Tether");
		assets.add(asset4);
		
		return assets;
		
	}
}
