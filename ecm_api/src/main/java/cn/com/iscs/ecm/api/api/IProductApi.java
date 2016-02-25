package cn.com.iscs.ecm.api.api;

import java.util.List;

public interface IProductApi {

	/**
	 * 抓取平台商品资料
	 *
	 * @param fetchType
	 * @param productNumId
	 */
	public List fetchProducts(int fetchType, String productNumId);

	/**
	 * 全量更新平台库存
	 *
	 * @param productNumId
	 * @param skuNumId
	 * @param productCode
	 * @param qtyOnLocation
	 * @param qtyAvailable
	 * @return
	 */
	public String uploadInventory(String productNumId, String skuNumId,
								  String productCode, int qtyOnLocation, int qtyAvailable) ;

	/**
	 * 增量更新平台库存
	 *
	 * @param productNumId
	 * @param skuNumId
	 * @param productCode
	 * @param qtyOnLocation
	 * @param qtyAvailable
	 * @return
	 */
	public String uploadInventoryAdd(String productNumId, String skuNumId,
									 String productCode, int qtyOnLocation, int qtyAvailable);
}
