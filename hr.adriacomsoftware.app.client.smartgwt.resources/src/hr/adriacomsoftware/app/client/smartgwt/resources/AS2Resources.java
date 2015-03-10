package hr.adriacomsoftware.app.client.smartgwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface AS2Resources extends ClientBundle{
	public static final AS2Resources INSTANCE =  GWT.create(AS2Resources.class);
	
	public static final String IMAGE_PATH = "../module/images/";
	
	
	public static final String RESULT_SET_PREVIOUS_PATH = IMAGE_PATH+"statusbar/resultsetprevious.png";
	public static final String RESULT_SET_NEXT_PATH = IMAGE_PATH+"statusbar/resultsetnext.png";
	
	public static final String FILE_UPLOAD_EXTENSION_32_PATH = IMAGE_PATH+"fileupload/extensions/s32/";
	
	public static final String DELETE_PATH = IMAGE_PATH+"icons/s16/delete.png";
	@Source("./images/icons/s16/delete.png")
	 ImageResource delete_icon();
	
	@Source("./images/icons/s16/edit.png")
	 ImageResource edit_icon();
	
	public static final String OPTIONS_ICON_PATH = IMAGE_PATH+"icons/s16/options.png";
	@Source("./images/icons/s16/options.png")
	 ImageResource options_icon();
	
	public static final String EXCELX_ICON_PATH = IMAGE_PATH+"icons/file_extensions/s16/xls.png";
	@Source("./images/icons/file_extensions/s16/xls.png")
	 ImageResource excelx_icon();
	
	public static final String PDF_ICON_PATH = IMAGE_PATH+"icons/file_extensions/s16/pdf.png";
	@Source("./images/icons/file_extensions/s16/pdf.png")
	 ImageResource pdf_icon();
	
	public static final String CANCEL_PATH = IMAGE_PATH+"icons/s16/cancel.png";
	@Source("./images/icons/s16/cancel.png")
	 ImageResource cancel_icon();
	
	public static final String PRINT_PREVIEW_PATH = IMAGE_PATH+"toolbar/printpreview.png";
	@Source("./images/toolbar/printpreview.png")
	 ImageResource print_preview();
	
	public static final String DOCUMENT_EDIT_PATH = IMAGE_PATH+"toolbar/document_edit.png";
	@Source("./images/toolbar/document_edit.png")
	 ImageResource document_edit();
	
	public static final String ADD_FILES_PATH = IMAGE_PATH+"icons/s16/add_files.png";
	@Source("./images/icons/s16/add_files.png")
	 ImageResource add_icon();
	
	public static final String SAVE_PATH = IMAGE_PATH+"icons/s16/save.png";
	@Source("./images/icons/s16/save.png")
	 ImageResource save_icon();
	
	public static final String WARNING_PATH = IMAGE_PATH+"icons/s16/warning.png";
	@Source("./images/icons/s16/warning.png")
	 ImageResource warning_icon();
	
	public static final String SEARCH_PATH = IMAGE_PATH+"/toolbar/search.png";
	@Source("./images/toolbar/search.png")
	 ImageResource search_icon();
	
	public static final String OPEN_DOCUMENT_ICON_PATH = IMAGE_PATH+"icons/s16/folder_document.png";
	@Source("./images/icons/s16/folder_document.png")
	 ImageResource open_document_icon();
	
	public static final String IMPORT_DATA_PATH = IMAGE_PATH+"icons/s16/importdata.png";
	@Source("./images/icons/s16/importdata.png")
	 ImageResource import_data_icon();
	
	public static final String MORE_DETAILS_PATH = IMAGE_PATH+"icons/s16/picker_default.png";
	@Source("./images/icons/s16/picker_default.png")
	 ImageResource more_details_icon();
	
	public static final String ASSIGN_PATH = IMAGE_PATH+"icons/s16/assign.png";
	@Source("./images/icons/s16/assign.png")
	 ImageResource assing_icon();
	
	public static final String RETRACT_PATH = IMAGE_PATH+"icons/s16/retract.png";
	@Source("./images/icons/s16/retract.png")
	 ImageResource retract_icon();
	
	public static final String HISTORY_PATH = IMAGE_PATH+"icons/s16/history16.png";
	@Source("./images/icons/s16/history16.png")
	 ImageResource history_icon();
	
	/**************************SKIN ICONS *******************/
	public static final String HELP_PATH= "[SKIN]/actions/help.png";
	
	/**************************QUICKFILL ICONS***************/
	public static final String HR_PATH = IMAGE_PATH+"icons/s16/hr.png";
	@Source("./images/icons/s16/hr.png")
	 ImageResource hr_icon();
	
	public static final String SI_PATH = IMAGE_PATH+"icons/s16/si.png";
	@Source("./images/icons/s16/si.png")
	 ImageResource si_icon();
	
	public static final String PB_PATH = IMAGE_PATH+"icons/s16/pb.png";
	@Source("./images/icons/s16/pb.png")
	 ImageResource pb_icon();
	
	/**************************TOOLBAR ICONS***************/
	public static final String TOOLBAR_FILTER_ICON_PATH = IMAGE_PATH+"toolbar/filter.png";
	@Source("./images/toolbar/filter.png")
	 ImageResource toolbar_filter_icon();
	
	public static final String TOOLBAR_REFRESH_ICON_PATH = IMAGE_PATH+"toolbar/refresh.png";
	@Source("./images/toolbar/refresh.png")
	 ImageResource toolbar_refresh_icon();
	
	public static final String TOOLBAR_SEARCH_ICON_PATH = IMAGE_PATH+"toolbar/search.png";
	@Source("./images/toolbar/search.png")
	 ImageResource toolbar_search_icon();
	
	public static final String TOOLBAR_DELETE_ICON_PATH = IMAGE_PATH+"toolbar/delete.png";
	@Source("./images/toolbar/delete.png")
	 ImageResource toolbar_delete_icon();
	
	public static final String TOOLBAR_DOCUMENT_NEW_ICON_PATH = IMAGE_PATH+"toolbar/document_new.png";
	@Source("./images/toolbar/document_new.png")
	 ImageResource toolbar_document_new_icon();

	public static final String TOOLBAR_DOCUMENT_EDIT_ICON_PATH = IMAGE_PATH+"toolbar/document_edit.png";
	@Source("./images/toolbar/document_edit.png")
	 ImageResource toolbar_document_edit_icon();
	
	@Source("./images/toolbar/credit-card.png")
	 ImageResource toolbar_credit_card_icon();
	
	@Source("./images/toolbar/score-icon.png")
	 ImageResource toolbar_score_icon();
	
	@Source("./images/toolbar/status-icon.png")
	 ImageResource toolbar_status_icon();
	
	public static final String ATTACHEMENT_ICON = IMAGE_PATH+"toolbar/attach-icon.png";
	public static final String TOOLBAR_ATTACHEMENT_ICON = IMAGE_PATH+"toolbar/attach-icon.png";
	@Source("./images/toolbar/attach-icon.png")
	 ImageResource toolbar_attachement_icon();
	
	public static final String TRANSFER_ICON = IMAGE_PATH+"toolbar/saveandclose.png";
	@Source("./images/toolbar/saveandclose.png")
	 ImageResource toolbar_transfer_icon();
	
	/**************************USER INTERFACE IMAGES***************/
	 @Source("./images/app_menu.jpg")
	 ImageResource app_menu();
	 
	 @Source("./images/application_menu_button_down.png")
	 ImageResource application_menu_button_down();
	 
	 @Source("./images/application_menu_button_over.png")
	 ImageResource application_menu_button_over();
	 
	 @Source("./images/application_menu.png")
	 ImageResource application_menu();
	 
	 @Source("./images/AS2Loading.gif")
	 ImageResource as2loading();
	 
	 @Source("./images/context_area.png")
	 ImageResource context_area();
	 
	 @Source("./images/loading.gif")
	 ImageResource loading();
	 
	 @Source("./images/masthead_background.jpg")
	 ImageResource masthead_background();
	 
	 @Source("./images/masthead_left_background.jpg")
	 ImageResource masthead_left_background();
	 
	 @Source("./images/masthead.jpg")
	 ImageResource mastheadJpg();
	 
	 @Source("./images/masthead.png")
	 ImageResource mastheadPng();
	 
	 @Source("./images/navigation_pane_gridcell_over.png")
	 ImageResource navigation_pane_gridcell_over();
	 
	 @Source("./images/navigation_pane_header.png")
	 ImageResource navigation_pane_header();
	 
	 @Source("./images/signin.gif")
	 ImageResource signin();
	 
	 @Source("./images/toolbar.png")
	 ImageResource toolbar();
	 
	 /**************************CHART ICONS*************************/
	 
	 @Source("./images/icons/graph/s16/Area.png")
	 ImageResource area_highchart();
	 
	 @Source("./images/icons/graph/s16/Bar.png")
	 ImageResource bar_highchart();
	 
	 @Source("./images/icons/graph/s16/BarNegStack.png")
	 ImageResource barNegStack_highchart();
	 
	 @Source("./images/icons/graph/s16/BasicPie.png")
	 ImageResource basicPie_highchart();
	 
	 @Source("./images/icons/graph/s16/Line.png")
	 ImageResource line_highchart();
	 
	 @Source("./images/icons/graph/s16/SpiderWeb.png")
	 ImageResource spiderWeb_highchart();

	 /**************************CHART ICONS*************************/
//	 /**************************CSS***************/
//	 
//	 @Source("./css/AS2Client.css")
//	 CssResource as2ClientCss();
}
	 
