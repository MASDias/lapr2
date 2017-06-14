package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventCenter {

    private EventEmployeeList eventEmployeeList;
    private ApplicationList applicationList;
    private AreaOfExpertiseList areaExpertiseList;
    private EventManagerList eventManagerList;
    private EventRegistry eventRegistry;
    private ExpertsList expertList;
    private LocationList locationList;
    private OrganizersList organizersList;
    private StandRegistry standRegistry;
    private UserRegistry userRegistry;
    private WorkshopList workshopList;
    private ProductList productList;

    /**
     *
     */
    public EventCenter() {
        this.eventEmployeeList = new EventEmployeeList();
        this.applicationList = new ApplicationList();
        this.areaExpertiseList = new AreaOfExpertiseList();
        this.eventManagerList = new EventManagerList();
        this.eventRegistry = new EventRegistry();
        this.expertList = new ExpertsList();
        this.locationList = new LocationList();
        this.organizersList = new OrganizersList();
        this.standRegistry = new StandRegistry();
        this.userRegistry = new UserRegistry();
        this.workshopList = new WorkshopList();
        this.productList=new ProductList();
    }

    /**
     *
     * @return
     */
    public EventEmployeeList getEventEmployeeList() {
        return eventEmployeeList;
    }

    /**
     *
     * @param eventEmployeeList
     */
    public void setEventEmployeeList(EventEmployeeList eventEmployeeList) {
        this.eventEmployeeList = eventEmployeeList;
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationList() {
        return applicationList;
    }

    /**
     *
     * @param applicationList
     */
    public void setApplicationList(ApplicationList applicationList) {
        this.applicationList = applicationList;
    }

    /**
     *
     * @return
     */
    public AreaOfExpertiseList getAreaExpertiseList() {
        return areaExpertiseList;
    }

    /**
     *
     * @param areaExpertiseList
     */
    public void setAreaExpertiseList(AreaOfExpertiseList areaExpertiseList) {
        this.areaExpertiseList = areaExpertiseList;
    }

    /**
     *
     * @return
     */
    public EventManagerList getEventManagerList() {
        return eventManagerList;
    }

    /**
     *
     * @param eventManagerList
     */
    public void setEventManagerList(EventManagerList eventManagerList) {
        this.eventManagerList = eventManagerList;
    }

    /**
     *
     * @return
     */
    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }

    /**
     *
     * @param eventRegistry
     */
    public void setEventRegistry(EventRegistry eventRegistry) {
        this.eventRegistry = eventRegistry;
    }

    /**
     *
     * @return
     */
    public ExpertsList getExpertList() {
        return expertList;
    }

    /**
     *
     * @param expertList
     */
    public void setExpertList(ExpertsList expertList) {
        this.expertList = expertList;
    }

    /**
     *
     * @return
     */
    public LocationList getLocationList() {
        return locationList;
    }

    /**
     *
     * @param locationList
     */
    public void setLocationList(LocationList locationList) {
        this.locationList = locationList;
    }

    /**
     *
     * @return
     */
    public OrganizersList getOrganizersList() {
        return organizersList;
    }

    /**
     *
     * @param organizersList
     */
    public void setOrganizersList(OrganizersList organizersList) {
        this.organizersList = organizersList;
    }

    /**
     *
     * @return
     */
    public StandRegistry getStandRegistry() {
        return standRegistry;
    }

    /**
     *
     * @param standRegistry
     */
    public void setStandRegistry(StandRegistry standRegistry) {
        this.standRegistry = standRegistry;
    }

    /**
     *
     * @return
     */
    public UserRegistry getUserRegistry() {
        return userRegistry;
    }

    /**
     *
     * @param userRegistry
     */
    public void setUserRegistry(UserRegistry userRegistry) {
        this.userRegistry = userRegistry;
    }

    /**
     *
     * @return
     */
    public WorkshopList getWorkshopList() {
        return workshopList;
    }

    /**
     *
     * @param workshopList
     */
    public void setWorkshopList(WorkshopList workshopList) {
        this.workshopList = workshopList;
    }

    /**
     *
     * @return
     */
    public ProductList getProductList() {
        return productList;
    }

    /**
     *
     * @param productList
     */
    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

}
