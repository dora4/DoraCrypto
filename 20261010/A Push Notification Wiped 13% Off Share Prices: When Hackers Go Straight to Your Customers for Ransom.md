# A Push Notification Wiped 13% Off Share Prices: When Hackers Go Straight to Your Customers for Ransom

## — The Cloud Storage Trust Crisis Behind the ASOS Incident, and What It Means for Your Files

On October 6, ASOS, the UK’s leading online fashion retailer, faced an unprecedented incident.

The hackers did not send ransom emails, nor did they contact the company’s IT department. Instead, they sent an in-app push notification directly to ASOS’s 16.4 million active users:

>
> “We have fully compromised your Snowflake instance. Negotiate with us, or we will publish your data.”

A Telegram link was attached to the message.

ASOS’s share price plummeted by 13% that day — its steepest one-day drop since September 2025. Snowflake, one of the world’s largest cloud data warehouse providers, also saw its pre-market share price fall by 3.2%.

This was no ordinary cyberattack. It marks a new ransom model: **attackers no longer negotiate with enterprises, but pressure businesses by holding consumers hostage.**
Your customer data becomes your hostage, and your cloud database is where those hostages are held.

## Timeline of Major Cloud Security Incidents in 2026

If you still think “cloud storage breaches” are rare, take a look at what unfolded this year:

表格

| Time | Incident | Impact |
| --- | --- | --- |
| Oct 2025 – Jul 2026 | Breach at the US Department of Defense Manpower Data Center (DMDC) | Social security numbers and service records of 2.8 million active and retired military personnel stolen; **data was unencrypted** |
| Aug 2026 | CareCloud healthcare data breach in the US | Full medical records, social security numbers and banking details of 3.75 million patients stolen |
| Sep 2026 | FBI personnel systems compromised by ShinyHunters | Personal information and medical records of numerous FBI agents and job applicants stolen |
| Sep 2026 | Japanese Asahi Kasei subsidiary Pharma DIGITAL hacked | Personal data of 558,700 individuals potentially exposed |
| Sep – Oct 2026 | Seven major South Korean banks hit by synchronized AI-powered hacks | Data of 68,000 customers leaked; President Lee Jae-myung ordered a full investigation |
| Oct 2026 | ASOS Snowflake cloud database compromised | Data of 16.4 million users threatened with public release |

Comcast Business’s 2026 Cybersecurity Threat Report revealed a staggering figure: 79.3 billion cybersecurity events detected over one year, averaging 2,514 events per second.

Data breaches are no longer “news.” They have become commonplace.

## Structural Flaws of Cloud Storage

All cloud storage services — from consumer platforms like Baidu Netdisk, iCloud and Google Drive, to enterprise-grade services including Snowflake and AWS S3 — share one core trait: **your data resides on someone else’s hard drives.**

This brings three critical implications:
**First, your data security depends on the provider’s security capabilities.** You may spend five minutes uploading a contract, while the provider may need (but may not be willing) to spend millions protecting it. ASOS likely believed its systems were secure, until hackers bypassed all defenses and sent push alerts directly to its users.

**Second, you have no physical control over your data.** You cannot know which server hosts your files, who has accessed them, or whether copies have been made. Providers claim “we do not read your files,” but you have no way to verify this.

**Third, the attack surface is always larger than you expect.** Hackers rarely mount frontal assaults on your encryption defenses. Instead, they exploit vulnerabilities in outsourced vendors, phishing weaknesses among staff, or permission overflows in third-party SDKs. In the South Korean bank attacks, targets were not core transaction systems, but peripheral tools such as staff mobile work platforms.

## An Alternative Architectural Approach

DoraCloud aims to address this question: **What if cloud storage assumes no trust in any third party from the very beginning?**

Its core design principles:
**Client-side encryption.** Files are encrypted locally on your device before upload. Encryption keys remain solely in your possession and are never uploaded to DoraCloud servers. This means even if DoraCloud’s servers are fully compromised, attackers will only obtain ciphertext — meaningless garbled data without the decryption key.

Looking back at the ASOS case: if data stored in Snowflake had been client-side encrypted (with ASOS holding the only keys), hackers would only have stolen ciphertext after breaching the Snowflake instance. The ransom threat would lose all leverage.

**Decentralized storage.** Files are split into fragments, encrypted, and distributed across multiple nodes. No single node can reconstruct the complete file. There is no central database protected by a single master key.

**Partitioned management.** General files (work documents, family photos) and sensitive private data (ID documents, banking information, medical reports) are stored in separate partitions. The private partition features independent encryption layers and access controls. Your personal journals do not need to sit in the same “safe” as your project proposals.

## This Is Not Anti-Cloud — It Is Cloud 2.0

It is important to clarify: DoraCloud does not require you to abandon cloud storage and revert to USB drives. Its user experience is broadly comparable to mainstream cloud drives: drag-and-drop uploads, folder management, online preview, multi-device synchronization — all standard features are available.

The difference lies in the underlying logic.
Traditional cloud storage operates on this premise: **“Hand over your files, and I will safeguard them for you.”**
DoraCloud follows a different rule: **“You lock your files securely, and I will store them for you.”**

This distinction may be invisible in daily use. But when hackers send push notifications to your users’ phones, when auditors ask “where is the data stored and who can access it,” or when you read news of another multi-million-record data leak — this difference becomes the only buffer between you and disaster.

## A Question Worth Posing

Among severe global cybersecurity incidents in 2026, data breaches account for 79.4%, and external intrusions are responsible for 70.6% of data events. These are not isolated mistakes by individual vendors, but systemic risks inherent to the centralized cloud storage model.

Behind every “compromised” case are millions of ordinary people. Their medical records, social security numbers, bank details and private photos become commodities on black markets and bargaining chips for ransom demands.

How much are your files worth?
To a hacker, they may only be worth a ransom payout. To you, they may be the full manuscript of your life.

Will you keep storing this manuscript on someone else’s hard drives?