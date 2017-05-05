# Monitor Docker with Telegraf and Grafana

## Run
```sh
docker-compose up --build
```

## Grafana
Open browser and fill the url `http://localhost:3000` with user `admin` and password `admin`.

## Add datasource
Menu -> Datasource -> Add data source.

- Name `your datasource name`.
- Type `InfluxDB`.

__Http Settings__
- Url `http://influxdb:8086`.
- Access `proxy`.

__InfluxDB Details__
- Database `telegraf`.
- User `root`.
- Password `root`.
