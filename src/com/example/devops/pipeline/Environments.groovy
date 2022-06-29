
import com.example.devops.pipeline.EnvironmentTypes

enum Environments {
    DEV01(
            "dev01",
            "DEV" as EnvironmentTypes,
            "1234.dkr.ecr.us-east-2.amazonaws.com",
            "",
            "us-east-2",
            "ecr-cred-dev",
            "dev01"
    )

    private String name
    private EnvironmentTypes envType
    private String ecr
    private String awsAccount
    private String region
    private String ecrSecrets
    private String eksClusterName

    private Environments(String name, EnvironmentTypes envType, String ecr, String awsAccount, String region, String ecrSecrets, String eksClusterName) {
        this.name = name
        this.envType = envType
        this.ecr = ecr
        this.awsAccount = awsAccount
        this.region = region
        this.ecrSecrets = ecrSecrets
        this.eksClusterName = eksClusterName
    }

    public static String getName(Environments env) {
        return env.@name
    }

    public static EnvironmentTypes getEnvType(Environments env) {
        return env.@envType
    }

    public static String getECR(Environments env) {
        return env.@ecr
    }

    public static String getAwsAccount(Environments env) {
        return env.@awsAccount
    }

    public static String getRegion(Environments env) {
        return env.@region
    }

    public static String getEcrSecrets(Environments env) {
        return env.@ecrSecrets
    }

    public static String getEksClusterName(Environments env) {
        return env.@eksClusterName
    }

    public static List getAllEnvs(){
        List allEnvs = [] as List
        Environments.values().each {
            allEnvs << it
        }
        return allEnvs
    }
}