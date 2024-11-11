public class BankService {
    @Autowired
    public BankService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public List<Service> getService() {
        return serviceRepository.findAll();
    }

    private final ServiceRepository serviceRepository;
}
