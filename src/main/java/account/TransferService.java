package account;

import com.sun.deploy.util.StringUtils;
import log.Logger;

public class TransferService {
    public void transfer(final String accountNumberSource, final String accountNumberDestination, double ammount) {
        Logger logger = Logger.getInstance();
        if (ammount > 0 && AccountNumberValidator.validate(accountNumberSource)
                && AccountNumberValidator.validate(accountNumberDestination)) {
            logger.log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");


        }
    }
}
