# Classifier REST Service

## Classify flow usage:

### Definition

`POST /classify`

### Body

All attributes are represented as integers. All attributes are required.
For a quick description of the features required for classification, see [flowtbag](https://github.com/DanielArndt/flowtbag/wiki/features).

Here's an example flow of class `normal`:

```json
{
"classifier": "randomtree",
"flow": {
        "total_fpackets": 29,
        "total_fvolume": 2478,
        "total_bpackets": 76,
        "total_bvolume": 51566,
        "min_fpktl": 40,
        "mean_fpktl": 85,
        "max_fpktl": 280,
        "std_fpktl": 54,
        "min_bpktl": 40,
        "mean_bpktl": 678,
        "max_bpktl": 1500,
        "std_bpktl": 686,
        "min_fiat": 0,
        "mean_fiat": 0,
        "max_fiat": 5,
        "std_fiat": 0,
        "min_biat": 0,
        "mean_biat": 0,
        "max_biat": 5,
        "std_biat": 0,
        "duration": 5,
        "min_active": 5, 
        "mean_active": 5, 
        "max_active": 5, 
        "std_active": 0,
        "min_idle": 0, 
        "mean_idle": 0,
        "max_idle": 0, 
        "std_idle": 0,
        "sflow_fpackets": 29, 
        "sflow_fbytes": 2478, 
        "sflow_bpackets": 76,
        "sflow_bbytes": 51566,
        "fpsh_cnt": 17, 
        "bpsh_cnt": 32, 
        "furg_cnt": 0, 
        "burg_cnt": 0, 
        "total_fhlen": 1168,
        "total_bhlen": 3056
    }
}
```

Any additional attributes are ignored.

### Response

- `202 Accepted` on sucess

```json
{
    constInteger
}
```
