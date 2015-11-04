package pl.java.scalatech.behave.replaceMethod;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.Call;

@Slf4j
public class MyService implements Service {

    private final Call customerRepo;

    public MyService(Call customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Object getBean(String beanNane) {
        return null;
    }

    @Override
    public void doSomethingWithItemRepo() {
        Call repo = getCurrencyRepo();
        log.info("+++ doSomethingWithRepo... start");
        repo.print(log, repo);

        log.info("+++ doSomethingWithRepo... end");

    }

    @Override
    public Call getCustomerRepo() {
        return customerRepo;
    }

    @Override
    public Call getCurrencyRepo() {
        return (CurrencyRepo) getBean("currencyRepo");
    }

}
