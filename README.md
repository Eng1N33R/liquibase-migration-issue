Test case for an issue with Liquibase migration file discovery.

## Testing
1. Run `mvn clean package assembly:single`.
2. Launch `liquibase-migrations.jar` in the generated target directory.
3. Observe that the migration defined in classpath:migrations/20180614.xml does not run (table `test` is not created in the database).
