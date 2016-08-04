<?php
$cURL = curl_init('162.243.44.4/server_list.json');
curl_setopt($cURL, CURLOPT_PORT, 3000);
curl_setopt($cURL, CURLOPT_RETURNTRANSFER, true);

$jsondata = curl_exec($cURL);
$json = json_decode($jsondata, true);

function ping($host,$port=4000,$timeout=6)
    {
        $fsock = fsockopen($host, $port, $errno, $errstr, $timeout);
        if ( ! $fsock )
        {
            return '<span>Offline</span>';
        }
        else
        {
            return '<span>Online</span>';
        }
    }

    echo '<div><ul class="gb-list-ul-ver-default">';
    echo 'Rucoy Server Checker';
    foreach ($json['servers'] as $js){

        echo '  <li>'.$js['name'] . ' is ' . ping($js['ip']).'</li>';
    }
    echo '</ul>
    
    </div>';
?>
