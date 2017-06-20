package comriyagharat.github.androidpackageapp;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Riya on 6/19/2017.
 * UNF, N00901846
 */

@IgnoreExtraProperties
public class Package {

    /* General values that are needed:
    * trackingNumber: the tracking number on the package
    * checkDelivered: yes or no flag to confirm the package was delivered
    * dateDelivered: the date which the package was delivered to the customer
    * dateArrived: the date which the package arrived at the facility
    */

    public String trackingNumber;
    public String checkDelivered;
    public String dateDelivered;
    public String dateArrived;

    /* Sender information
    * fromPhone: phone number of the sender, on package
    * fromCity: city of the sender address
    * fromState: state of the sender address
    * fromLocation: name of the sender location
    * fromRoad: the address of the sender
    * fromZip: zip code of the sender address
    * fromFirstName: first name of the sender
    * fromLastName: last name of the sender
    * fromMiddleInitial: middle initial of the sender, if applicable
    */

    public String fromPhone;
    public String fromCity;
    public String fromState;
    public String fromLocation;
    public String fromRoad;
    public String fromZip;
    public String fromFirstName;
    public String fromLastName;
    public String fromMiddleInitial;

    /* Receiver information
    * toCity: city of the receiver address
    * toLocation: name of the receiver location
    * toState: state of the receiver address
    * toRoad: the address of the receiver
    * toZip: zip code of the receiver address
    * toDoor: the door at which the package arrives
    * toFirstName: first name of the receiver
    * toLastName: last name of the receiver
    * toMiddleInitial: middle initial of the receiver
    */

    public String toCity;
    public String toLocation;
    public String toState;
    public String toRoad;
    public String toZip;
    public String toDoor;
    public String toFirstName;
    public String toLastName;
    public String toMiddleInitial;

    public Package(){
        // Blank default constructor
    }

    // GET: trackingNumber
    public String getTrackingNumber(){
        return trackingNumber;
    }

    // SET: trackingNumber
    public void setTrackingNumber(String trackingNumber1){
        this.trackingNumber = trackingNumber1;
    }

    // GET: checkDelivered
    public String getCheckDelivered(){
        return checkDelivered;
    }

    // SET: checkDelivered
    public void setCheckDelivered(String checkDelivered1){
        this.checkDelivered = checkDelivered1;
    }

    // GET: dateDelivered
    public String getDateDelivered(){
        return dateDelivered;
    }

    // SET: dateDelivered
    public void setDateDelivered(String dateDelivered1){
        this.dateDelivered = dateDelivered1;
    }

    // GET: dateArrived
    public String getDateArrived(){
        return dateArrived;
    }

    // SET: dateArrived
    public void setDateArrived(String dateArrived1){
        this.dateArrived = dateArrived1;
    }

    // GET: fromPhone
    public String getFromPhone(){
        return fromPhone;
    }

    // SET: fromPhone
    public void setFromPhone(String fromPhone1){
        this.fromPhone = fromPhone1;
    }

    // GET: fromCity
    public String getFromCity(){
        return fromCity;
    }

    // SET: fromCity
    public void setFromCity(String fromCity1){
        this.fromCity = fromCity1;
    }

    // GET: fromState
    public String getFromState(){
        return fromState;
    }

    // SET: fromState
    public void setFromState(String fromState1){
        this.fromState = fromState1;
    }

    // GET: fromLocation
    public String getFromLocation(){
        return fromLocation;
    }

    // SET: fromLocation
    public void setFromLocation(String fromLocation1){
        this.fromLocation = fromLocation1;
    }

    // GET: fromRoad
    public String getFromRoad(){
        return fromRoad;
    }

    // SET: fromRoad
    public void setFromRoad(String fromRoad1){
        this.fromRoad = fromRoad1;
    }

    // GET: fromZip
    public String getFromZip(){
        return fromZip;
    }

    // SET: fromZip
    public void setFromZip(String fromZip1){
        this.fromZip = fromZip1;
    }

    // GET: fromFirstName
    public String getFromFirstName(){
        return fromFirstName;
    }

    // SET: fromFirstName
    public void setFromFirstName(String fromFirstName1){
        this.fromFirstName = fromFirstName1;
    }

    // GET: fromLastName
    public String getFromLastName(){
        return fromLastName;
    }

    // SET: fromLastName
    public void setFromLastName(String fromLastName1){
        this.fromLastName = fromLastName1;
    }

    // GET: fromMiddleInitial
    public String getFromMiddleInitial(){
        return fromMiddleInitial;
    }

    // SET: fromMiddleInitial
    public void setFromMiddleInitial(String fromMiddleInitial1){
        this.fromMiddleInitial = fromMiddleInitial1;
    }

    // GET: toCity
    public String getToCity(){
        return toCity;
    }

    // SET: toCity
    public void setToCity(String toCity1){
        this.toCity = toCity1;
    }

    // GET: toLocation
    public String getToLocation(){
        return toLocation;
    }

    // SET: toLocation
    public void setToLocation(String toLocation1){
        this.toLocation = toLocation1;
    }

    // GET: toState
    public String getToState(){
        return toState;
    }

    // SET: toState
    public void setToState(String toState1){
        this.toState = toState1;
    }

    // GET: toRoad
    public String getToRoad(){
        return toRoad;
    }

    // SET: toRoad
    public void setToRoad(String toRoad1){
        this.toRoad = toRoad1;
    }

    // GET: toZip
    public String getToZip(){
        return toZip;
    }

    // SET: toZip
    public void setToZip(String toZip1){
        this.toZip = toZip1;
    }

    // GET: toDoor
    public String getToDoor(){
        return toDoor;
    }

    // SET: toDoor
    public void setToDoor(String toDoor1){
        this.toDoor = toDoor1;
    }

    // GET: toFirstName
    public String getToFirstName(){
        return toFirstName;
    }

    // SET: toFirstName
    public void setToFirstName(String toFirstName1){
        this.toFirstName = toFirstName1;
    }

    // GET: toLastName
    public String getToLastName(){
        return toLastName;
    }

    // SET: toLastName
    public void setToLastName(String toLastName1){
        this.toLastName = toLastName1;
    }

    // GET: toMiddleInitial
    public String getToMiddleInitial(){
        return toMiddleInitial;
    }

    // SET: toMiddleInitial
    public void setToMiddleInitial(String toMiddleInitial1){
        this.toMiddleInitial = toMiddleInitial1;
    }
}
