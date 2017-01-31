
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Activity_QNAME = new QName("http://ws/", "activity");
    private final static QName _Motivation_QNAME = new QName("http://ws/", "motivation");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://ws/", "getPersonByIdResponse");
    private final static QName _UpdateTimeForActivitySelectionResponse_QNAME = new QName("http://ws/", "updateTimeForActivitySelectionResponse");
    private final static QName _ActivitySelection_QNAME = new QName("http://ws/", "activitySelection");
    private final static QName _GetPersonById_QNAME = new QName("http://ws/", "getPersonById");
    private final static QName _MeasureRange_QNAME = new QName("http://ws/", "measureRange");
    private final static QName _SuggestActivities_QNAME = new QName("http://ws/", "suggestActivities");
    private final static QName _GetMeasureHistories_QNAME = new QName("http://ws/", "getMeasureHistories");
    private final static QName _HealthMeasureHistory_QNAME = new QName("http://ws/", "healthMeasureHistory");
    private final static QName _GetGoalHistoriesResponse_QNAME = new QName("http://ws/", "getGoalHistoriesResponse");
    private final static QName _Goal_QNAME = new QName("http://ws/", "goal");
    private final static QName _AddActivityToGoalResponse_QNAME = new QName("http://ws/", "addActivityToGoalResponse");
    private final static QName _GetGoalHistories_QNAME = new QName("http://ws/", "getGoalHistories");
    private final static QName _MeasureDefinition_QNAME = new QName("http://ws/", "measureDefinition");
    private final static QName _CreateNewGoalResponse_QNAME = new QName("http://ws/", "createNewGoalResponse");
    private final static QName _CreateNewGoal_QNAME = new QName("http://ws/", "createNewGoal");
    private final static QName _SearchActivitiesResponse_QNAME = new QName("http://ws/", "searchActivitiesResponse");
    private final static QName _UpdateHealthMeasure_QNAME = new QName("http://ws/", "updateHealthMeasure");
    private final static QName _AddActivityToGoal_QNAME = new QName("http://ws/", "addActivityToGoal");
    private final static QName _GetMeasureHistoriesResponse_QNAME = new QName("http://ws/", "getMeasureHistoriesResponse");
    private final static QName _HealthMeasure_QNAME = new QName("http://ws/", "healthMeasure");
    private final static QName _Person_QNAME = new QName("http://ws/", "person");
    private final static QName _SearchActivities_QNAME = new QName("http://ws/", "searchActivities");
    private final static QName _UpdateTimeForActivitySelection_QNAME = new QName("http://ws/", "updateTimeForActivitySelection");
    private final static QName _UpdateHealthMeasureResponse_QNAME = new QName("http://ws/", "updateHealthMeasureResponse");
    private final static QName _SuggestActivitiesResponse_QNAME = new QName("http://ws/", "suggestActivitiesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link Motivation }
     * 
     */
    public Motivation createMotivation() {
        return new Motivation();
    }

    /**
     * Create an instance of {@link GetPersonByIdResponse }
     * 
     */
    public GetPersonByIdResponse createGetPersonByIdResponse() {
        return new GetPersonByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateTimeForActivitySelectionResponse }
     * 
     */
    public UpdateTimeForActivitySelectionResponse createUpdateTimeForActivitySelectionResponse() {
        return new UpdateTimeForActivitySelectionResponse();
    }

    /**
     * Create an instance of {@link ActivitySelection }
     * 
     */
    public ActivitySelection createActivitySelection() {
        return new ActivitySelection();
    }

    /**
     * Create an instance of {@link GetPersonById }
     * 
     */
    public GetPersonById createGetPersonById() {
        return new GetPersonById();
    }

    /**
     * Create an instance of {@link MeasureRange }
     * 
     */
    public MeasureRange createMeasureRange() {
        return new MeasureRange();
    }
    
    /**
     * Create an instance of {@link SuggestActivities }
     * 
     */
    public SuggestActivities createSuggestActivities() {
        return new SuggestActivities();
    }

    /**
     * Create an instance of {@link GetMeasureHistories }
     * 
     */
    public GetMeasureHistories createGetMeasureHistories() {
        return new GetMeasureHistories();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link GetGoalHistoriesResponse }
     * 
     */
    public GetGoalHistoriesResponse createGetGoalHistoriesResponse() {
        return new GetGoalHistoriesResponse();
    }

    /**
     * Create an instance of {@link AddActivityToGoalResponse }
     * 
     */
    public AddActivityToGoalResponse createAddActivityToGoalResponse() {
        return new AddActivityToGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalHistories }
     * 
     */
    public GetGoalHistories createGetGoalHistories() {
        return new GetGoalHistories();
    }

    /**
     * Create an instance of {@link CreateNewGoalResponse }
     * 
     */
    public CreateNewGoalResponse createCreateNewGoalResponse() {
        return new CreateNewGoalResponse();
    }

    /**
     * Create an instance of {@link CreateNewGoal }
     * 
     */
    public CreateNewGoal createCreateNewGoal() {
        return new CreateNewGoal();
    }

    /**
     * Create an instance of {@link SearchActivitiesResponse }
     * 
     */
    public SearchActivitiesResponse createSearchActivitiesResponse() {
        return new SearchActivitiesResponse();
    }

    /**
     * Create an instance of {@link UpdateHealthMeasure }
     * 
     */
    public UpdateHealthMeasure createUpdateHealthMeasure() {
        return new UpdateHealthMeasure();
    }

    /**
     * Create an instance of {@link AddActivityToGoal }
     * 
     */
    public AddActivityToGoal createAddActivityToGoal() {
        return new AddActivityToGoal();
    }

    /**
     * Create an instance of {@link GetMeasureHistoriesResponse }
     * 
     */
    public GetMeasureHistoriesResponse createGetMeasureHistoriesResponse() {
        return new GetMeasureHistoriesResponse();
    }
    
    /**
     * Create an instance of {@link HealthMeasure }
     * 
     */
    public HealthMeasure createHealthMeasure() {
        return new HealthMeasure();
    }

    /**
     * Create an instance of {@link SearchActivities }
     * 
     */
    public SearchActivities createSearchActivities() {
        return new SearchActivities();
    }

    /**
     * Create an instance of {@link UpdateTimeForActivitySelection }
     * 
     */
    public UpdateTimeForActivitySelection createUpdateTimeForActivitySelection() {
        return new UpdateTimeForActivitySelection();
    }

    /**
     * Create an instance of {@link UpdateHealthMeasureResponse }
     * 
     */
    public UpdateHealthMeasureResponse createUpdateHealthMeasureResponse() {
        return new UpdateHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link SuggestActivitiesResponse }
     * 
     */
    public SuggestActivitiesResponse createSuggestActivitiesResponse() {
        return new SuggestActivitiesResponse();
    }

    /**
     * Create an instance of {@link Person.HealthMeasures }
     * 
     */
    public Person.HealthMeasures createPersonHealthMeasures() {
        return new Person.HealthMeasures();
    }

    /**
     * Create an instance of {@link Person.HealthMeasuresHistories }
     * 
     */
    public Person.HealthMeasuresHistories createPersonHealthMeasuresHistories() {
        return new Person.HealthMeasuresHistories();
    }

    /**
     * Create an instance of {@link Person.Goals }
     * 
     */
    public Person.Goals createPersonGoals() {
        return new Person.Goals();
    }

    /**
     * Create an instance of {@link MeasureDefinition.MeasureRanges }
     * 
     */
    public MeasureDefinition.MeasureRanges createMeasureDefinitionMeasureRanges() {
        return new MeasureDefinition.MeasureRanges();
    }

    /**
     * Create an instance of {@link Goal.ActivitySelections }
     * 
     */
    public Goal.ActivitySelections createGoalActivitySelections() {
        return new Goal.ActivitySelections();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Motivation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "motivation")
    public JAXBElement<Motivation> createMotivation(Motivation value) {
        return new JAXBElement<Motivation>(_Motivation_QNAME, Motivation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPersonByIdResponse")
    public JAXBElement<GetPersonByIdResponse> createGetPersonByIdResponse(GetPersonByIdResponse value) {
        return new JAXBElement<GetPersonByIdResponse>(_GetPersonByIdResponse_QNAME, GetPersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTimeForActivitySelectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateTimeForActivitySelectionResponse")
    public JAXBElement<UpdateTimeForActivitySelectionResponse> createUpdateTimeForActivitySelectionResponse(UpdateTimeForActivitySelectionResponse value) {
        return new JAXBElement<UpdateTimeForActivitySelectionResponse>(_UpdateTimeForActivitySelectionResponse_QNAME, UpdateTimeForActivitySelectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivitySelection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "activitySelection")
    public JAXBElement<ActivitySelection> createActivitySelection(ActivitySelection value) {
        return new JAXBElement<ActivitySelection>(_ActivitySelection_QNAME, ActivitySelection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPersonById")
    public JAXBElement<GetPersonById> createGetPersonById(GetPersonById value) {
        return new JAXBElement<GetPersonById>(_GetPersonById_QNAME, GetPersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "measureRange")
    public JAXBElement<MeasureRange> createMeasureRange(MeasureRange value) {
        return new JAXBElement<MeasureRange>(_MeasureRange_QNAME, MeasureRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestActivities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "suggestActivities")
    public JAXBElement<SuggestActivities> createSuggestActivities(SuggestActivities value) {
        return new JAXBElement<SuggestActivities>(_SuggestActivities_QNAME, SuggestActivities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getMeasureHistories")
    public JAXBElement<GetMeasureHistories> createGetMeasureHistories(GetMeasureHistories value) {
        return new JAXBElement<GetMeasureHistories>(_GetMeasureHistories_QNAME, GetMeasureHistories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "healthMeasureHistory")
    public JAXBElement<HealthMeasureHistory> createHealthMeasureHistory(HealthMeasureHistory value) {
        return new JAXBElement<HealthMeasureHistory>(_HealthMeasureHistory_QNAME, HealthMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getGoalHistoriesResponse")
    public JAXBElement<GetGoalHistoriesResponse> createGetGoalHistoriesResponse(GetGoalHistoriesResponse value) {
        return new JAXBElement<GetGoalHistoriesResponse>(_GetGoalHistoriesResponse_QNAME, GetGoalHistoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddActivityToGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addActivityToGoalResponse")
    public JAXBElement<AddActivityToGoalResponse> createAddActivityToGoalResponse(AddActivityToGoalResponse value) {
        return new JAXBElement<AddActivityToGoalResponse>(_AddActivityToGoalResponse_QNAME, AddActivityToGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalHistories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getGoalHistories")
    public JAXBElement<GetGoalHistories> createGetGoalHistories(GetGoalHistories value) {
        return new JAXBElement<GetGoalHistories>(_GetGoalHistories_QNAME, GetGoalHistories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "measureDefinition")
    public JAXBElement<MeasureDefinition> createMeasureDefinition(MeasureDefinition value) {
        return new JAXBElement<MeasureDefinition>(_MeasureDefinition_QNAME, MeasureDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createNewGoalResponse")
    public JAXBElement<CreateNewGoalResponse> createCreateNewGoalResponse(CreateNewGoalResponse value) {
        return new JAXBElement<CreateNewGoalResponse>(_CreateNewGoalResponse_QNAME, CreateNewGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createNewGoal")
    public JAXBElement<CreateNewGoal> createCreateNewGoal(CreateNewGoal value) {
        return new JAXBElement<CreateNewGoal>(_CreateNewGoal_QNAME, CreateNewGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchActivitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "searchActivitiesResponse")
    public JAXBElement<SearchActivitiesResponse> createSearchActivitiesResponse(SearchActivitiesResponse value) {
        return new JAXBElement<SearchActivitiesResponse>(_SearchActivitiesResponse_QNAME, SearchActivitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateHealthMeasure")
    public JAXBElement<UpdateHealthMeasure> createUpdateHealthMeasure(UpdateHealthMeasure value) {
        return new JAXBElement<UpdateHealthMeasure>(_UpdateHealthMeasure_QNAME, UpdateHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddActivityToGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addActivityToGoal")
    public JAXBElement<AddActivityToGoal> createAddActivityToGoal(AddActivityToGoal value) {
        return new JAXBElement<AddActivityToGoal>(_AddActivityToGoal_QNAME, AddActivityToGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getMeasureHistoriesResponse")
    public JAXBElement<GetMeasureHistoriesResponse> createGetMeasureHistoriesResponse(GetMeasureHistoriesResponse value) {
        return new JAXBElement<GetMeasureHistoriesResponse>(_GetMeasureHistoriesResponse_QNAME, GetMeasureHistoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "healthMeasure")
    public JAXBElement<HealthMeasure> createHealthMeasure(HealthMeasure value) {
        return new JAXBElement<HealthMeasure>(_HealthMeasure_QNAME, HealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchActivities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "searchActivities")
    public JAXBElement<SearchActivities> createSearchActivities(SearchActivities value) {
        return new JAXBElement<SearchActivities>(_SearchActivities_QNAME, SearchActivities.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTimeForActivitySelection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateTimeForActivitySelection")
    public JAXBElement<UpdateTimeForActivitySelection> createUpdateTimeForActivitySelection(UpdateTimeForActivitySelection value) {
        return new JAXBElement<UpdateTimeForActivitySelection>(_UpdateTimeForActivitySelection_QNAME, UpdateTimeForActivitySelection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateHealthMeasureResponse")
    public JAXBElement<UpdateHealthMeasureResponse> createUpdateHealthMeasureResponse(UpdateHealthMeasureResponse value) {
        return new JAXBElement<UpdateHealthMeasureResponse>(_UpdateHealthMeasureResponse_QNAME, UpdateHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestActivitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "suggestActivitiesResponse")
    public JAXBElement<SuggestActivitiesResponse> createSuggestActivitiesResponse(SuggestActivitiesResponse value) {
        return new JAXBElement<SuggestActivitiesResponse>(_SuggestActivitiesResponse_QNAME, SuggestActivitiesResponse.class, null, value);
    }

}
