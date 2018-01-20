package ma.ac.emi.simplesoftphone.ui;

public interface SipCall {
    void ringing();

    void incomingCall(String from);

    void answeredCall();

    void cancelCall();

    void addReceivedMessage(String receivedMessage);

    void addSentMessage(String sentMessage);
}
