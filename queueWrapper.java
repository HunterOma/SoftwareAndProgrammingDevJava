import java.util.Scanner;
public class queueWrapper {
    public static void main(String[] args) {
            System.out.println("Please enter 5 pieces of data, seperated into different sentences.");
            //User input for data to be added to the queue
            Scanner dataQuestion = new Scanner(System.in);
                String dataQuestion1 = dataQuestion.nextLine();
                String dataQuestion2 = dataQuestion.nextLine();
                String dataQuestion3 = dataQuestion.nextLine();
                String dataQuestion4 = dataQuestion.nextLine();
                String dataQuestion5 = dataQuestion.nextLine();
            QueueTest dataQueue = new QueueTest();
            //Create the queue list to use for the program
                queueData queue = new queueData(dataQuestion1);
                    dataQueue.queueNode(queue);
                    queue = new queueData(dataQuestion2);
                    dataQueue.queueNode(queue);
                    queue = new queueData(dataQuestion3);
                    dataQueue.queueNode(queue);
                    queue = new queueData(dataQuestion4);
                    dataQueue.queueNode(queue);
                    queue = new queueData(dataQuestion5);
                    dataQueue.queueNode(queue);


    }
}
